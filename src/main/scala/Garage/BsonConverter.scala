package Garage

import org.mongodb.scala.bson.{BsonTransformer, BsonValue}
import org.mongodb.scala.bson.collection.immutable.Document

class BsonConverter {
  def bsonTransformer[T](value: T)(implicit transformer: BsonTransformer[T]):BsonValue = {
    transformer(value)
  }

  def objectToDocument(obj: Product) = {
//    val values = obj.productIterator
    val bsonSeq = obj.getClass.getDeclaredFields.map(_.getName -> obj.productIterator.next).toMap.toSeq.map{
//    val bsonValue = objMap.toSeq.map {
      case (key, value:String) => (key, bsonTransformer(value))
      case (key, value:Int) => (key, bsonTransformer(value))
      case (key, value:Double) => (key, bsonTransformer(value))
      case (key, value:Boolean) => (key, bsonTransformer(value))
    }
    Document.fromSeq(bsonSeq)

  }

}
