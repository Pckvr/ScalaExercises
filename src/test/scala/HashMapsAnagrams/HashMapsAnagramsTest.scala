package HashMapsAnagrams

import Day6.HashMapAnagrams
import resources.BaseTestingClass

class HashMapsAnagramsTest extends BaseTestingClass{
  var hashMapsAnagrams: HashMapAnagrams = _
  val wordList:String = "C:\\Users\\Admin\\IdeaProjects\\ScalaExercises\\src\\test\\scala\\HashMapsAnagrams\\wordList.txt"

  before {
    hashMapsAnagrams = new HashMapAnagrams
  }

  "A user" should " be able to instantiate a new hashMapAnagrams" in {
    assert(true)
  }

  "The method readFromFile" should " be able to read a line of words from a file" in {
  assert(hashMapsAnagrams.readLineFromFile(wordList) == "race catch offer\ntrain hope dog\nsnake rain trap")
  }

}
