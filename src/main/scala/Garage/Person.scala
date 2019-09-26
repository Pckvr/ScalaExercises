package Garage

abstract class Person {
  val id: Int
  val title: String       //could use enums in future
  val forename: String
  val surname: String
  val address: Address
  var mobile: String
  var email: String

}