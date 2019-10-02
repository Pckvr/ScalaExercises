package Garage

import resources.BaseTestingClass
import org.mongodb.scala._
import org.mockito.Mockito._

class MongoConnectionTests extends BaseTestingClass {

  var mongoConnection: MongoConnection = _
  var mockMongoConnection = mock[MongoConnection]
  before {
    mongoConnection = new MongoConnection
  }

  "The function getConnection" should "return a mongo client" in {
    when(mockMongoConnection.getConnection()).thenReturn(MongoClient("mongodb://test"))
    assert(mockMongoConnection.getConnection().isInstanceOf[MongoClient])
  }

//  "The function getDatabase" should "return a database" in {
//    val mockMongoConnection = mock[MongoConnection]
//    when(
//  }






}
