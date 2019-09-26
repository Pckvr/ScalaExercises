package Day3

object UniqueSum extends App{

  def uniqueSum(int1: Int, int2: Int, int3:Int) = {
    val numbers = List(int1, int2, int3)

    val duplicates = numbers diff numbers.distinct

    val toBeAdded = numbers filterNot duplicates.contains

    val sum = toBeAdded.sum

    println("List of numbers is " + numbers)
    println("The unique sum is " + sum)

  }
    uniqueSum(1, 2, 3)
    uniqueSum(3, 1, 1)
    uniqueSum(1, 2, 1)
    uniqueSum(1, 1, 19)
    uniqueSum(1, 1, 1)

}
