package calculator

import Day5.Calculator
import resources.BaseTestingClass

class CalculatorTest extends BaseTestingClass {

  var calculator: Calculator = _

  before {
    calculator = new Calculator
  }

  "A user" should " be able to instantiate a new calculator" in {
    assert(true)
  }
  it should "be able to add two numbers" in {
    assert(calculator.add(1,2) == 3)
    assert(calculator.add(-1,2) == 1)

  }
  it should "be able to subtract two numbers" in {
    assert(calculator.subtract(5,1) == 4)
    assert(calculator.subtract(-5,1) == -6)

  }
  it should "be able to multiply two numbers" in {
    assert(calculator.multiply(5, 4) == 20)
    assert(calculator.multiply(-5, 4) == -20)

  }
  it should "be able to divide two numbers" in {
    assert(calculator.divide(10,2) ==5)
    assert(calculator.divide(-10,2) == -5)

  }
  it should "not be able to divide by zero" in {
    assert(calculator.divide(10, 0) == println("You can not divide by zero!"))
    assert(calculator.divide(-10, 0) == println("You can not divide by zero!"))

  }
  it should "be able to calculate the power of two numbers" in {
    assert(calculator.power(4,2) == 16)
    assert(calculator.power(-4,2) == 16)

  }



}
