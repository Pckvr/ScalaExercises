package Day4

object Lumberjack extends App {

  def logPileSorter(logPiles: Array[Int], newLogs: Int, indexCount: Int = 0):Any = {
    if (newLogs != 0) {
      logPileSorter(logPiles, newLogs, indexCount = 0)
      if (indexCount < logPiles.length) {
        if (logPiles(indexCount) <= logPiles.min) {
          logPiles.update(indexCount, logPiles(indexCount) + 1)
          logPileSorter(logPiles, newLogs - 1, indexCount + 1)
        }
        else {
          logPileSorter(logPiles, newLogs, indexCount + 1)
        }
      }
    }   else {
      println(logPiles)
    }
  }
  logPileSorter(Array(1,1,1,2,1,3,1,4,1), 7)

}
