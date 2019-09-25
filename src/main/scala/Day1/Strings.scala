package Day1

object Strings extends App {


  def strings(strParam: String, intParam: Int): Unit = {

    println(strParam.length - intParam)

  }

  strings("hello", 2)
}
