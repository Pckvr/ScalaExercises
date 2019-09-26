package Garage

abstract class Person (
  val title: String,        //could use enums in future
  val forename: String,
  val surname: String,
  val address: Address,
  val telephoneHome: String,
  val telephoneMobile: String) {

  override def toString: String =
    s"""$title $forename $surname,
       |$address,
       |$telephoneHome,
       |$telephoneMobile
       |""".stripMargin
}
