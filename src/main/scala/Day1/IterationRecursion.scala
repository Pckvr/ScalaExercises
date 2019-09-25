package Day1

object IterationRecursion extends App{

  def iterationRecursion(str:String, int:Int):Unit= {

  if (int>0) {
    if(int!=0){
      iterationRecursion(str, int-1)
      println(str)
    }
  }
  }
  iterationRecursion("Hello", 5)

}

