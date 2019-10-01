package Garage

class Garage {

  var isGarageOpen = true

  //collection class
  //holds ids for vehicles, customers, employees

  var vehicleList: Map[Int, Vehicle] = Map()
  var employeeList: Map[Int, Employee] = Map()
  var customerList: Map[Int, Customer] = Map()

  def newCar(regNo: String, make: String, model: String, colour: String, customerID: Int) = {
    val car = new Car(regNo, make, model, colour, customerID)
    vehicleList += (car.vehicleID -> car)
  }

  def newBike(regNo: String, make: String, model: String, colour: String, customerID: Int) = {
    val bike = new Bike(regNo, make, model, colour, customerID)
    vehicleList += (bike.vehicleID -> bike)
  }

  def registerEmployee(title: String,forename: String,surname: String, houseNo:Int, street: String, town: String, city: String, postcode: String, mobile: String, email: String , jobRole: String) = {
    val employee = new Employee(title, forename, surname, new Address(houseNo, street, town, city, postcode), mobile, email, jobRole)
    employeeList += (employee.id -> employee)
  }

  def registerCustomer(title: String,forename: String,surname: String, houseNo:Int, street: String, town: String, city: String, postcode: String, mobile: String, email: String) = {
    val customer = new Customer(title, forename, surname, new Address(houseNo, street, town, city, postcode), mobile, email)
    customerList += (customer.id -> customer)
  }

  def removeVehicle(vehicleId:Int) = {
    vehicleList -= vehicleId
  }

  def fixVehicle(vehicleId:Int): Unit ={
    val fixedVehicle = vehicleList(vehicleId)
    fixedVehicle.isFixed = true
    vehicleList -= vehicleId
    vehicleList += (vehicleId -> fixedVehicle)
  }

  def calculateBill(partsBroken:List[String], labourHours:Double) = { //Will be type List[Parts]

  }

  def garageContents() = {
    vehicleList.values.foreach(vehicle=>println(vehicle.toString))
    }


  def openGarage(): Unit ={
    isGarageOpen = true
  }
  def closeGarage(): Unit ={
    isGarageOpen = false
  }

}
