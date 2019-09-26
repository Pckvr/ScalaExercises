package Garage

import javax.swing.plaf.BorderUIResource.TitledBorderUIResource

class Customer (
  val id: Int,
  val title: String, //could use enums in future
  val forename: String,
  val surname: String,
  val address: Address,
  var telephoneHome: String,
  var telephoneMobile: String,
  var email: String,
  var vehicleID: List[Int]     //can have multiple vehicles
   ) extends Person {

  def this(
           title: String,
           forename:String,
           surname:String,
           address: Address,
           telephoneHome: String,
           telephoneMobile:String,
           email:String) = this (
    Customer.generateId(), //create auto id
    title,
    forename,
    surname,
    address: Address,
    telephoneHome,
    telephoneMobile,
    email,
    List(0)
  )

    override def toString: String =
      s"""$id
         |$title $forename $surname
         |$address
         |$telephoneHome
         |$telephoneMobile
         |$email""".stripMargin

}

object Customer {
  var idCount = 0

  def generateId(): Int = {
    idCount += 1
    idCount
  }
}
