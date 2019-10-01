package Garage

import org.mongodb.scala._

class MongoConnection {

  val mongoClientPath = "//localhost"
  val databaseName = "garage"

  def getConnection():MongoClient = {
    val mongoClient = MongoClient("mongodb:" + mongoClientPath)
    mongoClient
  }

  def closeCollection() = {
    getConnection().close()
  }

  def getDatabase():MongoDatabase = {
    val database = getConnection().getDatabase(databaseName)
    database
  }

  def getCollection(collectionName: String) = {
    val collection = getDatabase().getCollection(collectionName)
    collection
  }

}
