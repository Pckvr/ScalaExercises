package Garage

case class Employee (
  val id: Int,
  val title: String, //could use enums in future
  val forename: String,
  val surname: String,
  val address: Address,
  var mobile: String,
  var email: String,
  var jobRole: String, //enum in future
  var isAvailable: Boolean
    ) extends Person {

  def this(
           title: String,
           forename:String,
           surname:String,
           address: Address,
           mobile:String,
           email:String,
           jobRole: String) = this (
    Employee.generateId(), //create auto id
    title,
    forename,
    surname,
    address: Address,
    mobile,
    email,
    jobRole,
    false
  )

  override def toString: String =
    s"""$id
       |$title $forename $surname,
       |$address,
       |$mobile,
       |$jobRole
       |$email""".stripMargin

}

object Employee extends GenerateId {
  var idCount = 0
  generateId()
}