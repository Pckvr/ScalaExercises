package Day6

import scala.io.Source

class HashMapAnagrams {

def readLineFromFile(filename: String) = {

  val source = Source.fromFile(filename)

  for (line <- source.getLines) {
    line
  }

}

}
