package Garage

import scala.util.Random

class Part (val name:String,
            var broken: Boolean = Random.nextInt(100) match{
              case _%10 == 0 => true
              case _ => false
            },
            val cost: Int = Random.nextInt(500),
            val labourHours: Double = Random.nextInt(10)) {

  override def toString: String =
    s"""$name
       |$broken
       |$cost
       |$labourHours""".stripMargin

}

object Part {
  val partsList: List[String] = List("front tyre(s)", "rear tyre", "windscreen", "engine", "mirrors", "radio", "headlights", "indicator lights", "brake pads", "chassis")

  def generateVehicleParts(): Array[Part] ={
    var vehicleParts: Array[Part] = Array()
    partsList.foreach(name => {vehicleParts :+ new Part(name)})
    vehicleParts
  }
}
