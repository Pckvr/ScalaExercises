package Day1

object Strings extends App {


  def strings(strParam: String, intParam: Int): Unit = {
    val lenFromEnd: Int = strParam.length - intParam
    println(lenFromEnd)

  }:Unit

  strings("hello", 2)
}
