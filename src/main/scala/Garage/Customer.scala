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

  def this(id: Int,
           title: String,
           forename:String,
           surname:String,
           address: Address,
           telephoneHome: String,
           telephoneMobile:String,
           email:String) = this (
    id, //create auto id
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
      s"""$title $forename $surname
         |$address
         |$telephoneHome
         |$telephoneMobile
         |$email""".stripMargin

}
