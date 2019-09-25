//import scala.io.Source
//
//object Day2 extends App {
//
//  val lines = Source.fromFile("C:\\Users\\tadas\\IdeaProjects\\ScalaExercisesDelete\\src\\main\\resources\\wordlist.txt").getLines.toList
//
//  val wordCheck: (String, String) => Boolean = (potentialLongerWord, keys) => {
//    (potentialLongerWord.toList.toSet equals keys.toList.toSet) || (potentialLongerWord.toList.toSet.subsetOf(keys.toList.toSet))
//  }
//
//  val isNewWordLonger: (String, String) => Boolean = (oldWord, newWord) => {
//    oldWord.length < newWord.length
//  }
//
//  def longestWord(keys: String) = {
//    lines.reduceLeft(
//      (leftWord: String, rightWord: String) => {
//        if (isNewWordLonger(leftWord, rightWord) & wordCheck(rightWord, keys)) {
//          rightWord
//        } else {
//          leftWord
//        }
//      }
//    )
//  }
//
//  println("enter number of keyboards")
//  val numberOfkeyboards = readLine().toInt
//  for(index <- 1 to numberOfkeyboards) {
//    println("enter available keys")
//    println("longest word: " + longestWord(readLine()))
//  }
//
//}