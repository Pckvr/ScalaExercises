package Garage

import resources.BaseTestingClass
import org.mongodb.scala._
import org.mockito.Mockito._

class MongoConnectionTests extends BaseTestingClass {

  var mongoConnection: MongoConnection = _
  var mockMongoConnection: MongoConnection = _
  before {
    mongoConnection = new MongoConnection
    mockMongoConnection = mock[MongoConnection]
  }

  "The function getConnection" should "return a mongo client" in {
    when(mockMongoConnection.getConnection()).thenReturn(MongoClient("mongodb://test"))
    assert(mockMongoConnection.getConnection().isInstanceOf[MongoClient])
  }

  "The function getDatabase" should "return a database" in {

    val mockDatabase :com.mongodb.async.client.MongoDatabase = mock[com.mongodb.async.client.MongoDatabase]
    when(mockMongoConnection.getDatabase()).thenReturn(MongoDatabase(mockDatabase))
    assert(mockMongoConnection.getDatabase().isInstanceOf[MongoDatabase])
  }

  "The function getCollection" should "return a collection" in {
    val mockCollection: com.mongodb.async.client.MongoCollection[Document] = mock[com.mongodb.async.client.MongoCollection[Document]]
    //val test: MongoCollection[Document] = mock[MongoCollection[Document]]

    when(mockMongoConnection.getCollection("test")).thenReturn(new MongoCollection[Document](mockCollection))
    assert(mockMongoConnection.getCollection("test").isInstanceOf[MongoCollection[Document]])
  }






}
