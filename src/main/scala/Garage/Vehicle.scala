package Garage

abstract class Vehicle {
  val id: Int
  val vehicleType: String    //enum in future
  val make: String
  val model: String
  val colour: String
  val customerID: Int
}
