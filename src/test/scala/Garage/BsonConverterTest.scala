package Garage

import org.mongodb.scala.bson._
import resources.BaseTestingClass

class BsonConverterTest extends BaseTestingClass {

  var bsonConverter: BsonConverter = _

  before {
    bsonConverter = new BsonConverter
    garage = new Garage
  }

  "bsonTransformer" should "be able to convert any value into a bson value" in {
    assert(bsonConverter.bsonTransformer("a": String).isInstanceOf[BsonString])
    assert(bsonConverter.bsonTransformer("abcdef": String).isInstanceOf[BsonString])
    assert(bsonConverter.bsonTransformer(1: Int).isInstanceOf[BsonInt32])
    assert(bsonConverter.bsonTransformer(-90: Int).isInstanceOf[BsonInt32])
    assert(bsonConverter.bsonTransformer(1.04: Double).isInstanceOf[BsonDouble])
    assert(bsonConverter.bsonTransformer(-56.09: Double).isInstanceOf[BsonDouble])
    assert(bsonConverter.bsonTransformer(true: Boolean).isInstanceOf[BsonBoolean])
    assert(bsonConverter.bsonTransformer(false: Boolean).isInstanceOf[BsonBoolean])
  }

  "objectToDocument" should "be able to convert any object into a bson document" in {

    assert(bsonConverter.objectToDocument(testCar))
  }
}
