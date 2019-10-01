package Garage

import org.mongodb.scala._
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}

class MongoConnection {

  val mongoClientPath = "//localhost"
  val databaseName = "garage"

  def getConnection(): MongoClient = {
    val mongoClient = MongoClient("mongodb:" + mongoClientPath)
    mongoClient
  }

  def closeCollection() = {
    getConnection().close()
  }

  def getDatabase(): MongoDatabase = {
    val database = getConnection().getDatabase(databaseName)
    database
  }

  def getCollection(collectionName: String): MongoCollection[Document] = {
    val collection = getDatabase().getCollection(collectionName)
    collection
  }

  def addDocument(document: Document, collectionName: String) = {
    getCollection(collectionName).insertOne(document)
      .subscribe(new Observer[Completed] {
        override def onNext(result: Completed): Unit = println("Document has been inserted")
        override def onError(e: Throwable): Unit = println(s"Failed ${e.getStackTrace.toString}")
        override def onComplete(): Unit = println("Document(s) have been inserted")
      })
  }

  def getAllDocuments(collectionName: String) = {
    getCollection(collectionName).find()
  }

  def getFirstDocument(collectionName: String) = {
    getCollection(collectionName).find().head()
  }

  def deleteById(collectionName: String, id: Int) = collectionName match {
    case "Employee" | "Customer" => {
      getCollection(collectionName).deleteOne(equal("id", id)).headOption().onComplete {
        onCompleteSuccessFailure()
      }
    }
    case "Vehicle" | "Car" | "Bike" => {
      getCollection(collectionName).deleteOne(equal("vehicleID", id)).headOption().onComplete {
        onCompleteSuccessFailure()
      }
}
  }
  def onCompleteSuccessFailure(): Unit = {
    case Success(value) => println("Successful")
    case Failure(error) => error.printStackTrace()
  }


}
