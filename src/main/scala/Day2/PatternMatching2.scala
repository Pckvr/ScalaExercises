package Day2



object PatternMatching2 extends App{
  def patternMatching2(input:AnyRef) = input match {
    case(int1, int2) => println(int2, int1)
    case array: Array[Int] if array.length >=2 => Array(array(1), array(0))
    case list: List[Int] if list.length >=2 => println(List(list(1), list(0)))
    case tuple: (Int,Int) => println((tuple._2, tuple._1))

  }
  patternMatching2(1,2)
  patternMatching2(Array(1, 2, 3)) == Array(2, 1)
  patternMatching2(List(1,2,3))
  patternMatching2((1,2))
}
