package resources

import org.scalatest._
import org.scalatestplus.mockito.MockitoSugar
import Garage.Garage

abstract class BaseTestingClass extends FlatSpec with Matchers with OptionValues with Inside with Inspectors with
  MockitoSugar with BeforeAndAfter {

  var garage = new Garage

  var testCar = garage.newCar("AB12 CDE", "Fiat", "Punto", "Black", 1)
  var testBike = garage.newBike("AB12 CDE", "Ducatti", "Something", "Red", 1)
  var testEmployee = garage.registerEmployee("Mr", "Pete", "Smith", 1, "Test Street", "Test Town", "Test City", "T3 5TY", "012345678", "test@test.com", "Mechanic" )
  var testCustomer = garage.registerCustomer("Mr", "Simon", "Jones", 2, "Test Street", "Test Town", "Test City", "T3 5TY", "012345678", "test@test.com")


}
