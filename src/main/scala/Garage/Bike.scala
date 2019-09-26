package Garage

class Bike  (
  val vehicleID: Int,
  val regNo: String,
  val vehicleType: String,   //enum in future
  val make: String,
  val model: String,
  val colour: String,
  val customerID: Int,
            ) extends Vehicle {
  override def toString: String =
    s"""$regNo,
       |$vehicleType,
       |$make $model,
       |$colour,
       |$customerID
       |""".stripMargin

}