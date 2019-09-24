package Day1

object Conditionals2 extends App{

  def conditionals2(int1:Int, int2:Int, check:Boolean):Unit = {

    if(int1 == 0) {
      println(int2)
    }
    else if ( int2 ==0) {
      println(int1)
    }
    else if (check) {
      val sum: Int = int1 + int2
      println(sum)
    }: Unit
    else if (!check) {
      val sum: Int = int1 * int2
      println(sum)
    }

  }

  conditionals2(4,0,true)
  conditionals2(4,6,false)

}
