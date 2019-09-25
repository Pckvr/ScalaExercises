package Day1

object Conditionals extends App{

  def conditionals(int1:Int, int2:Int, check:Boolean)= {
    if (check) {
      println(int1 + int2)
    } else if (!check) {
      println(int1 * int2)
    }

  }

  conditionals(4,6,true)
  conditionals(4,6,false)

}
