package Garage

object test extends App{

  var Bob = println(new Customer(
    title = "Mr",
    forename = "Bob",
    surname = "Test",
    address = new Address(
      houseNo = 1,
      street = "Test Street",
      town = "Test Town",
      city = "Test City",
      postcode = "T3 5TY"),
    telephoneHome = "0123456789",
    telephoneMobile = "0123456789",
    email = "test@test.com"
  ))

//  var Pete = println(new Employee(
//    title = "Mr",
//    forename = "Pete",
//    surname = "Testo",
//    address = new Address(
//      houseNo = 1,
//      street = "Test Road",
//      town = "Testing Town",
//      city = "Testing City",
//      postcode = "T3 5TY"),
//    telephoneHome = "0123456789",
//    telephoneMobile = "0123456789",
//    email = "test@test.com",
//    jobRole = "Mechanic"
//  ))


}
