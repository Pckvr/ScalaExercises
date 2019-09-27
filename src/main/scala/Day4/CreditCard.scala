package Day4

import scala.collection.mutable.ListBuffer

object CreditCard extends App{

  def addCheckDigit(identifyingNo: String, checkDigit: Int) = {
    (identifyingNo + checkDigit).map(_.asDigit).toList.reverse.to[ListBuffer]
  }

  def validateIdentifyingNumber(numberWithCheck: ListBuffer[Int], index:Int = 1):Boolean = {
    if (index <= (numberWithCheck.length-1) ) {
      if (index % 2 != 0) {
        numberWithCheck.update(index, numberWithCheck(index)*2)
        validateIdentifyingNumber(numberWithCheck: ListBuffer[Int], index + 1)
      } else {
        validateIdentifyingNumber(numberWithCheck: ListBuffer[Int], index + 1)
      }
    }
      else {
      println(numberWithCheck.mkString("").map(_.asDigit))
      println(numberWithCheck.mkString("").map(_.asDigit).sum)
      numberWithCheck.mkString("").map(_.asDigit).sum % 10 == 0
        }
      }

  if (validateIdentifyingNumber(addCheckDigit("4992739871", 6)) == true) {
    println("Identifying number is valid")
  } else {
    println("Identifying number is invalid")
  }


}
