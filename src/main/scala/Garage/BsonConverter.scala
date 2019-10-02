package Garage

import org.mongodb.scala.bson.collection.immutable.Document
import org.mongodb.scala.bson._

class BsonConverter {
  def bsonTransformer[T](value: T)(implicit transformer: BsonTransformer[T]):BsonValue = {
    transformer(value)
  }

  def objectToDocument(obj:Product) = {

    //val objProduct = obj -> obj: Product
//    val values = obj.productIterator
    val bsonSeq = obj.getClass.getDeclaredFields.map(_.getName -> obj.productIterator.next).toMap.toSeq.map{
//    val bsonValue = objMap.toSeq.map {
      case (key, value:String) => (key, bsonTransformer(value))
      case (key, value:Int) => (key, bsonTransformer(value))
      case (key, value:Double) => (key, bsonTransformer(value))
      case (key, value:Boolean) => (key, bsonTransformer(value))
      //case _ => ("got to here", bsonTransformer("blah"))
    }
    bsonTransformer(Document.fromSeq(bsonSeq))

  }
}
