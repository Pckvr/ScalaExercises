package Day3

object TooHot extends App{

  def tooHot(temperature:Int, isSummer:Boolean) = (temperature, isSummer) match{
    case (_, false) if temperature >= 60 && temperature <=90 => println(true)
    case(_, true) if temperature >=60 && temperature <=100 => println(true)
    case _ => println(false)
  }
  tooHot(75, false)
  tooHot(95, false)
  tooHot(96, true)
  tooHot(40, false)
  tooHot(120, true)

}
