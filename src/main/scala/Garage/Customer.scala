package Garage

class Customer (
  val id: Int,
  val title: String, //could use enums in future
  val forename: String,
  val surname: String,
  val address: Address,
  val telephoneHome: String,
  val telephoneMobile: String,
  val vehicleID: Array[Int]     //can have multiple vehicles
   ) extends Person {

    override def toString: String =
      s"""$title $forename $surname,
         |$address,
         |$telephoneHome,
         |$telephoneMobile
         |""".stripMargin

}
