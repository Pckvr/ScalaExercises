package Day2

object PatternMatching1 extends App{
  def patternMatching1(int1:Int, int2:Int, check:Boolean) = check match{
    case check => println(int1 + int2)
    case _ => println(int1 * int2)
  }
  patternMatching1(4,6, true)
  patternMatching1(4,6,false)

}
