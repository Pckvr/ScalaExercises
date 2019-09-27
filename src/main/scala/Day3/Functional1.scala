package Day3

import java.util

object Functional1 extends App{

  //val allData = java.util.TimeZone.getAvailableIDs.mkString(", ").split("/").mkString(", ")
  //println(allData)

 // val availableIds = java.util.TimeZone.getAvailableIDs.mkString(", ").split("/").tail.mkString(", ").split(", ").grouped(2).flatMap(_.take(1)).toArray.mkString(", ")
  //println(availableIds)

  val groupedIds = java.util.TimeZone.getAvailableIDs.mkString(", ").split("/").tail.mkString(", ").split(", ").grouped(2).flatMap(_.take(1)).grouped(10).toArray.mkString(", ")
  println(groupedIds)

}
