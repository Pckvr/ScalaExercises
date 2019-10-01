package Day6

import scala.io.Source

class HashMapAnagrams {

def storeLinesInArray(filename: String) = {
  val source = Source.fromFile(filename)
  val linesArray = source.getLines.toArray
  linesArray
}

  def extractWordFromLine(filename: String) = {
    val source = Source.fromFile(filename)
    val wordsArray = source.getLines().toString()
    println(wordsArray)
  }

}
