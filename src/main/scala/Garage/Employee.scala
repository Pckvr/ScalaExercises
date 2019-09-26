package Garage

class Employee (
  val id: Int,
  val title: String, //could use enums in future
  val forename: String,
  val surname: String,
  val address: Address,
  val telephoneHome: String,
  val telephoneMobile: String,
  val jobRole: String //enum in future
    ) extends Person {

  override def toString: String =
    s"""$title $forename $surname,
       |$address,
       |$telephoneHome,
       |$telephoneMobile,
       |$jobRole
       |""".stripMargin

}
               )

}
