package Garage

import scala.util.Random

case class Part (val name:String,
            var broken: Boolean = Random.nextInt(100) match{
              //case _ %10 == 0 => true
              case _ => false
            },
            cost: Int = Random.nextInt(500),
            labourHours: Double = Random.nextInt(10)) {

  override def toString: String =
    s"""$name
       |$broken
       |$cost
       |$labourHours""".stripMargin

}

object Part {
  val partsList: Seq[String] = Seq("front tyre(s)", "rear tyre", "windscreen", "engine", "mirrors", "radio", "headlights", "indicator lights", "brake pads", "chassis")

  def generateVehicleParts(): Seq[Part] ={
    val vehicleParts: Seq[Part] = Seq()
    partsList.foreach(name => {vehicleParts :+ new Part(name)})
    vehicleParts
  }
}
