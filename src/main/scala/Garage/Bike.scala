package Garage

class Bike  (
  val vehicleID: Int,
  val regNo: String,
  val vehicleType: String,   //enum in future
  val make: String,
  val model: String,
  val colour: String,
  val customerID: Int,
  val isFixed:Boolean
            ) extends Vehicle {

    def this(
             regNo: String,
             make:String,
             model: String,
             colour:String,
             customerID:Int) = this (
      Vehicle.generateId(), //create auto id
      regNo,
      "Motorbike",
      make,
      model,
      colour,
      customerID, //add function to find id from email address?? And to limit to existing users
      false
    )


  override def toString: String =
    s"""$regNo,
       |$vehicleType,
       |$make $model,
       |$colour,
       |$customerID""".stripMargin

}