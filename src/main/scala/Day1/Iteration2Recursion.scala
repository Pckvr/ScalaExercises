package Day1

object Iteration2Recursion extends App{

  def iteration2Recursion(str:String, int:Int, count:Int = 0): Unit = {
    if (int>0) {
      if(int!=0){
        iteration2Recursion(str, int-1, count+1)
        println(str*(int+count))
      }
    }
  }
  iteration2Recursion("Hello", 5)
  }


