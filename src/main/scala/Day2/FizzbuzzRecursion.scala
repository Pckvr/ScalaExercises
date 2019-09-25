package Day2

import scala.annotation.tailrec

object FizzbuzzRecursion extends App{
@tailrec
  def fizzbuzzRecursion(str1:String, str2:String, int:Int):Unit= {

    if (int>0) {
      if (int!=0) {

        val intBy3:Boolean = int%3 ==0
        val intBy5:Boolean = int%5 ==0

        if (intBy3 && intBy5 :Boolean) {
          println(str1+str2)
        }
        else if (intBy3:Boolean) {
          println(str1)
        }
        else if (intBy5:Boolean) {
          println(str2)
        }
        else {
          println(int)
        }
        fizzbuzzRecursion(str1, str2, int-1)
      }
    }
  }
  fizzbuzzRecursion("fizz", "buzz", 15)
}
