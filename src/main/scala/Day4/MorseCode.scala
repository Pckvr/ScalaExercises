package Day4

object MorseCode extends App{

  def morseTranslator(morseText:String):Unit = {

    val english = Array( "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
      "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x",
      "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0",
      ",", ".", "?", " " )

    val morse = Array( ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
      ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
      "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
      "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
      "-----", "--..--", ".-.-.-", "..--..", "/" )

    val morseToEnglish = (morse zip english).toMap

    morseText.split(" ").foreach( value =>
      print(morseToEnglish(value))
    )

  }
  morseTranslator("... --- ... / ... --- ...")

  }
