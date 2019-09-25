package Day2

import scala.collection.mutable.ListBuffer

object BrokenKeyboard extends App {

  import scala.io.Source
  val words = Source.fromURL("http://norvig.com/ngrams/enable1.txt").mkString.split("\\n").toList
  val alphabet = ('a' to 'z').toList.to[ListBuffer]



  def longestWord(noKeyboards:Int, keys:String, longestWord:String) = {
  // still need to add user defined keyboard capability
//    val random = scala.util.Random
//    val noKeyboards = random.nextInt(9) + 1

//    val invalidLetters = (alphabet -= ('a', 'd', 'e', 't')).toList
    val invalidLetters = alphabet -= keys.toArray
    println(invalidLetters)

    val validWords = words.filter(word => !invalidLetters.exists(letter => word.contains(letter.toString)))
    println(validWords)
    val longestWord = validWords.maxBy(_.length)
    print("The longest word is " + longestWord)


    //random integer, i to determine number of sets of random letters




    //  for (i <- 1 to 4) {
    //    val letter = alphabet(random.nextInt(26) + 1).toString
    //    var word = letter
    //    println(word)
    //  }
  }
}





//i random set of 4 letters
