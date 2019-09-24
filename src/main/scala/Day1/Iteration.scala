package Day1

object Iteration extends App{

  def iteration(str:String, int:Int):Unit = {
    for (i <- 1 to int) {
      println(str)
    }
  }
  iteration("Hi", 5)


}
