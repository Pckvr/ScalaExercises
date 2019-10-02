package Garage

import resources.BaseTestingClass
import org.mongodb.scala._
import org.mockito.Mockito._

class MongoConnectionTests extends BaseTestingClass {

  var mongoConnection: MongoConnection = _

  before {
    mongoConnection = new MongoConnection
  }

  "The function getConnection" should "return a mongo client" in {
    val mockMongoConnection = mock[MongoConnection]
    when(mockMongoConnection.getConnection()).thenReturn(MongoClient("mongodb://test"))
    assert(mockMongoConnection.getConnection().isInstanceOf[MongoClient])
  }

  "The function closeConnection" should






}
