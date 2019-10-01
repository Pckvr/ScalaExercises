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

  "The method storeLinesInArray" should " be able to store the lines of text in an array" in {
  assert(hashMapsAnagrams.storeLinesInArray(wordList) sameElements Array("race catch offer", "train hope dog", "snake rain trap"))
  }

  "The method extractWordFromLine" should "be able to return a word from each line of a text file and store it in an array" in {
    hashMapsAnagrams.extractWordFromLine(wordList)
    //assert(hashMapsAnagrams.extractWordFromLine(wordList) sameElements Array("race", "train", "snake"))
  }

}
