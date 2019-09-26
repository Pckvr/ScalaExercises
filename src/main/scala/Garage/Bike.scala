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

  //  def this(vehicleID: Int,
  //           regNo: String,
  //           vehicleType:String,
  //           make:String,
  //           model: String,
  //           colour:String,
  //           customerID:Int) = this (
  //    vehicleID, //create auto id
  //    regNo,
  //    vehicleType,
  //    make,
  //    model,
  //    colour,
  //    customerID, //add function to find id from email address??
  //  )


  override def toString: String =
    s"""$regNo,
       |$vehicleType,
       |$make $model,
       |$colour,
       |$customerID""".stripMargin

}