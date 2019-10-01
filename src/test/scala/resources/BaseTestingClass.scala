package resources

import org.scalatest.{BeforeAndAfter, FlatSpec, Inside, Inspectors, Matchers, OptionValues}
import org.scalatestplus.mockito.MockitoSugar

abstract class BaseTestingClass extends FlatSpec with Matchers with
  OptionValues with Inside with Inspectors with
  MockitoSugar with BeforeAndAfter
