package Garage

abstract class Vehicle {
  val vehicleID: Int
  val regNo: String
  val vehicleType: String    //enum in future
  val make: String
  val model: String
  val colour: String
  val customerID: Int
}
