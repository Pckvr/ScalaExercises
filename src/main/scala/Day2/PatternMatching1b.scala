package Day2

object PatternMatching1b extends App{
  def patternMatching2(int1:Int, int2:Int, check:Boolean) = (int1, int2, check) match{
    case(0,_,_) => println(int2)
    case(_,0,_) => println(int1)
    case (_,_,true) => println(int1 + int2)
    case (_,_,false) => println(int1 * int2)
  }
  patternMatching2(4,6, true)
  patternMatching2(4,6,false)
  patternMatching2(0,6, true)
  patternMatching2(4,0, true)

}
