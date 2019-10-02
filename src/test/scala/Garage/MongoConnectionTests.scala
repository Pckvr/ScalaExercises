package Garage

import resources.BaseTestingClass

class MongoConnectionTests extends BaseTestingClass {

  var mongoConnection: MongoConnection = _

  before {
    mongoConnection = new MongoConnection
  }



}
