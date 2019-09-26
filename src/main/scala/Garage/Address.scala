package Garage

class Address (
  var houseNo: Int,
  var street: String,
  var town: String,
  var city: String,
  var postcode: String) {
    override def toString: String =
      s"""$houseNo $street,
         |$town,
         |$city,
         |$postcode
         |""".stripMargin

}
