package Day5

class Calculator {

  def add(num1: Double, num2: Double) = {
    num1 + num2
  }
  def subtract(num1: Double, num2: Double) = {
    num1 - num2
  }
  def multiply(num1: Double, num2: Double) = {
    num1 * num2
  }
  def divide(num1: Double, num2: Double) = {
    if (num1 != 0 && num2 != 0){
      num1/num2
    }
    else {
      println("You can not divide by zero!")
    }

  }

}
