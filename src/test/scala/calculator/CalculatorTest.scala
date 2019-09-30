package calculator

import org.scalatest.FlatSpec
import resources.BaseTestingClass


class CalculatorTest extends BaseTestingClass {
  "user input" should "be an integer" in {
    def verifyInputDataType(num1: Any, num2: Any) = (num1, num2) match {
      case (num1: Int, num2: Int) => true
      case _ => false
    }
    assert(verifyInputDataType(1, 2))
  }

}
