package Day1

import scala.annotation.tailrec

object IterationRecursion extends App{

@tailrec
  def iterationRecursion(str:String, int:Int):Unit= {

  if (int>0) {
    if(int!=0){
      println(str)
      iterationRecursion(str, int-1)
    }
  }
  }
  iterationRecursion("Hello", 5)

}

