package Day1

object Conditionals extends App{

  def conditionals(int1:Int, int2:Int, check:Boolean):Unit = {
    if (check) {
      val sum: Int = int1 + int2
      println(sum)
    }: Unit else if (!check) {
      val sum: Int = int1 * int2
      println(sum)
    }

  }

  conditionals(4,6,true)
  conditionals(4,6,false)

}
