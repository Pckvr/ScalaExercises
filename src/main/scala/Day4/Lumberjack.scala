package Day4

object Lumberjack extends App {

  def logPileSorter(logPiles: Array[Int], newLogs: Int):Any = {
    var logs = newLogs
      var smallestPile = logPiles.min
      for(pile <- 0 to logPiles.length-1) {
        if(logs >0) {
        if (logPiles(pile) == smallestPile) {
          logPiles.update(pile, logPiles(pile)+1)
          logs -= 1
        }
      }
    }
    logPiles.foreach(println)
  }
  logPileSorter(Array(1,1,1,2,1,3,1,4,1), 7)
}
