package Garage

class Garage {

  //collection class
  //holds ids for vehicles, customers, employees

  val vehicleList: Map[Int, Vehicle] = Map()
  val employeeList: Map[Int, Employee] = Map()
  val customerList: Map[Int, Customer] = Map()

  def newCar(regNo: String, make: String, model: String, colour: String, customerID: Int) = {
    val car = new Car(regNo, make, model, colour, customerID)
    val vehicleList = (car.vehicleID -> car) + vehicleList
  }
  def newBike(regNo: String, make: String, model: String, colour: String, customerID: Int) = {
    val bike = new Bike(regNo, make, model, colour, customerID)
    val vehicleList = (bike.vehicleID -> bike) + vehicleList
  }
  def registerEmployee(title: String,forename: String,surname: String, houseNo:Int, street: String, town: String, city: String, postcode: String, mobile: String, email: String , jobRole: String) = {
    val employee = new Employee(title, forename, surname, new Address(houseNo, street, town, city, postcode), mobile, email, jobRole)
    val employeeList = (employee.id -> employee) + employeeList
  }
  def registerCustomer(title: String,forename: String,surname: String, houseNo:Int, street: String, town: String, city: String, postcode: String, mobile: String, email: String) = {
    val customer = new Customer(title, forename, surname, new Address(houseNo, street, town, city, postcode), mobile, email)
    val customerList = (customer.id -> customer) + customerList
  }

  def fixVehicle(vehicleId:Int): Unit ={

  }

}
