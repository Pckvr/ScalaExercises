package Day1

object FizzBuzz extends App{

  def fizzbuzz(str1:String, str2:String, int: Int):Unit = {


    for ( i <- 1 to int) {

      var iBy3:Boolean = i%3 ==0:Boolean
      var iBy5:Boolean = i%5 ==0:Boolean

      if (iBy3 && iBy5 :Boolean) {
        println(str1+str2)
      }
      else if (iBy3:Boolean) {
        println(str1)
      }
      else if (iBy5:Boolean) {
        println(str2)
      }
      else {
        println(i)
      }
    }
  }:Unit
fizzbuzz("Fizz", "Buzz", 15)
}
