package Garage

import javax.swing.plaf.BorderUIResource.TitledBorderUIResource

class Customer (
  val id: Int,
  val title: String, //could use enums in future
  val forename: String,
  val surname: String,
  val address: Address,
  var mobile: String,
  var email: String,
  var vehicleID: List[Int]     //can have multiple vehicles
   ) extends Person {

  def this(
           title: String,
           forename:String,
           surname:String,
           address: Address,
           mobile:String,
           email:String) = this (
    Customer.generateId(), //create auto id
    title,
    forename,
    surname,
    address: Address,
    mobile,
    email,
    List(0)
  )

    override def toString: String =
      s"""$id
         |$title $forename $surname
         |$address
         |$mobile
         |$email""".stripMargin

}

object Customer extends GenerateId {
  var idCount = 0
  generateId()
}
