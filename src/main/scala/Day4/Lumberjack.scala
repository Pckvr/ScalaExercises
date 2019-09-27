package Day4

object Lumberjack extends App {

  def logPileSorter(storageAreaSize: Int, newLogs: Int, smallestPileSize:Int = 0) = {

    var storageArea = Array.ofDim[Int](storageAreaSize, storageAreaSize)
    storageArea(0)(0) = 1;    storageArea(1)(0) = 1;    storageArea(2)(0) = 1
    storageArea(0)(1) = 2;    storageArea(1)(1) = 1;    storageArea(2)(1) = 3
    storageArea(0)(2) = 1;    storageArea(1)(2) = 4;    storageArea(2)(2) = 1

    printStorageArea(storageArea, storageAreaSize)


        if(rowCount < storageArraySize) {
          if (columnCount < storageArraySize) {
            print(storageArea(columnCount)(rowCount))
            printStorageArea(storageArea, storageArraySize, columnCount +1, rowCount)
          }
          printStorageArea(storageArea, storageArraySize, columnCount = 0, rowCount+1)
          println()
          print(storageArea(columnCount)(rowCount))
          printStorageArea(storageArea, storageArraySize, columnCount, rowCount +1)
        }
      }




  }

  logPileSorter(3, 7)

  def printStorageArea(storageArea: Array[Array[Int]], storageAreaSize: Int): Unit = {
    for (y <- 0 until storageAreaSize) {
      for (x <- 0 until storageAreaSize) {
        print(" " + storageArea(x)(y))
      }
      println()
    }
  }
}
