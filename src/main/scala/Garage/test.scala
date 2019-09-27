package Garage

object test extends App{

  val Bob = println(new Customer(
    title = "Mr",
    forename = "Bob",
    surname = "Test",
    address = new Address(
      houseNo = 1,
      street = "Test Street",
      town = "Test Town",
      city = "Test City",
      postcode = "T3 5TY"),
    mobile = "0123456789",
    email = "test@test.com"
  ))
  val Tom = println(new Customer(
    title = "Mr",
    forename = "Bob",
    surname = "Test",
    address = new Address(
      houseNo = 1,
      street = "Test Street",
      town = "Test Town",
      city = "Test City",
      postcode = "T3 5TY"),
    mobile = "0123456789",
    email = "test@test.com"
  ))

  val Pete = println(new Employee(
    title = "Mr",
    forename = "Pete",
    surname = "Testo",
    address = new Address(
      houseNo = 1,
      street = "Test Road",
      town = "Testing Town",
      city = "Testing City",
      postcode = "T3 5TY"),
    mobile = "0123456789",
    email = "test@test.com",
    jobRole = "Mechanic"
  ))

  val CarTest = println(new Car(
    regNo = "AB12 CDE",
    make = "Ford",
    model= "Fiesta",
    colour = "Blue",
    customerID = 1
  ))

  val BikeTest = println(new Car(
    regNo = "AB12 CDE",
    make = "Kawasaki",
    model= "Ninja",
    colour = "red",
    customerID = 2
  ))


}
