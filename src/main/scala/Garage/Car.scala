package Garage

case class Car (
  val vehicleID: Int,
  val regNo: String,
  val vehicleType: String,   //enum in future
  val make: String,
  val model: String,
  val colour: String,
  val customerID: Int,
  var partsList: Seq[Part],
  var isFixed:Boolean
      ) extends Vehicle {

  def this(
           regNo: String,
           make:String,
           model: String,
           colour:String,
           customerID:Int) = this (
    Vehicle.generateId(), //create auto id
    regNo,
    "Car",
    make,
    model,
    colour,
    customerID, //add function to find id from email address?? And to limit to existing users
    Part.generateVehicleParts(),
    false
  )

  override def toString: String =
    s"""$vehicleID
       |$regNo
       |$vehicleType
       |$make $model
       |$colour
       |$customerID""".stripMargin

}
