package Day1

object Iteration2 extends App{
  def iteration2(str:String, int:Int): Unit = {
    for (i <- 1 to int) {
      println(str * int)
    }
  }
iteration2("H", 4)
}
