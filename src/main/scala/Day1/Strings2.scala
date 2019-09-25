package Day1

object Strings2 extends App{
  def strings2(str1:String, str2:String, char1:Char, char2:Char)= {

    println((str1.concat(str2)).replace(char1, char2))
  }
  strings2("Hello", "Hello", 'l' :Char, 'y': Char)

}
