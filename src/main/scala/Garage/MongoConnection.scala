package Garage

import org.mongodb.scala._

class MongoConnection {

  val mongoClientPath = "//localhost"
  val databaseName = "garage"

  def getConnection(): MongoClient = {
    MongoClient("mongodb:" + mongoClientPath)
  }

  def closeCollection() = {
    getConnection().close()
  }

  def getDatabase(): MongoDatabase = {
    getConnection().getDatabase(databaseName)
  }

  def getCollection(collectionName: String): MongoCollection[Document] = {
    getDatabase().getCollection(collectionName)
  }

}
