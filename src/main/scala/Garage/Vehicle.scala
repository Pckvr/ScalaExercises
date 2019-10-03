package Garage

abstract class Vehicle {
  val vehicleID: Int
  val regNo: String
  val vehicleType: String    //enum in future
  val make: String
  val model: String
  val colour: String
  val customerID: Int
  var partsList: Seq[Part]
  var isFixed: Boolean

  override def toString: String =
    s"""$vehicleID
       |$regNo
       |$vehicleType
       |$make $model
       |$colour
       |$customerID""".stripMargin

}

object Vehicle extends GenerateId {
  var idCount = 0
  generateId()
}


