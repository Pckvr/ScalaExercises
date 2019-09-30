package Garage

class Garage {

  //collection class
  //holds ids for vehicles, customers, employees

  val vehicleList: Map[Int, Vehicle] = Map()
  val employeeList: Map[Int, Employee] = Map()
  val customerList: Map[Int, Customer] = Map()

  def newCar(regNo: String, make: String, model: String, colour: String, customerID: Int) = {
    val car = new Car(regNo, make, model, colour, customerID)
    vehicleList += (car.vehicleID -> car)
  }

  def newBike(regNo: String, make: String, model: String, colour: String, customerID: Int) = {
    val bike = new Bike(regNo, make, model, colour, customerID)
    vehicleList += (bike.vehicleID -> bike)
  }

}
