package Garage

object test extends App{

  var Bob = new Customer(
    id = 1,
    title = "Mr",
    forename = "Bob",
    surname = "Test",
    address = new Address(houseNo = 1,
      street = "Test Street",
      town = "Test Town",
      city = "Test City",
      postcode = "T3 5TY"  ),
    telephoneHome = "0123456789",
    telephoneMobile = "0123456789",
    email = "test@test.com",
    vehicleID = Array[1,2]
  )


}
