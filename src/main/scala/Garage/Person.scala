package Garage

abstract class Person {
  val id: Int
  val title: String       //could use enums in future
  val forename: String
  val surname: String
  val address: Address
  var telephoneHome: String
  var telephoneMobile: String
  var email: String

}

//  override def toString: String =
//    s"""$title $forename $surname,
//       |$address,
//       |$telephoneHome,
//       |$telephoneMobile
//       |""".stripMargin

