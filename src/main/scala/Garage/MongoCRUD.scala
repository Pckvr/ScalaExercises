package Garage

import org.mongodb.scala._
import org.mongodb.scala.bson.{BsonTransformer, BsonValue}
import org.mongodb.scala.model.Filters._

import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}

class MongoCRUD extends MongoConnection {

  def addDocument(document: Object, collectionName: String) = {
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

    def deleteById(collectionName: String, id: Int): Unit = collectionName match {
      case "Employee" | "Customer" =>
        getCollection(collectionName).deleteOne(equal("id", id)).headOption().onComplete {
          case Success(value) => println("Successful")
          case Failure(error) => error.printStackTrace()
        }
      case "Vehicle" | "Car" | "Bike" =>
        getCollection(collectionName).deleteOne(equal("vehicleID", id)).headOption().onComplete {
          case Success(value) => println("Successful")
          case Failure(error) => error.printStackTrace()
        }
    }

//  def onCompleteSuccessFailure(): Unit = {
//      case Success(value) => println("Successful")
//      case Failure(error) => error.printStackTrace()
//    }




}
