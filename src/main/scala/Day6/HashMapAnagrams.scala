package Day6

import scala.io.Source

class HashMapAnagrams {

def storeLinesInArray(filename: String) = {
  val source = Source.fromFile(filename)
  val linesArray = source.getLines.toArray
  linesArray
}

}
