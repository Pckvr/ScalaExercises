//package Day4
//
//object LumberjackBAD extends App {
//
//
//  def logPileSorter(storageArea: Array[Array[Int]], newLogs: Int, smallestPileSize:Int = 0, rowCount:Int = 0, columnCount: Int = 0) = {
//    val storageAreaSize = storageArea.length -1
//
//    if (rowCount < storageAreaSize) {
//
//      if (columnCount < storageAreaSize) {
//
//        if(storageArea(columnCount)(rowCount) <= smallestPileSize) {
//          storageArea(columnCount)(rowCount) += 1
//
//        }
//
//        logPileSorter(storageArea, storageAreaSize, columnCount + 1, rowCount)
//      }
//      logPileSorter(storageArea, storageAreaSize, columnCount = 0, rowCount + 1)
//      println()
//      print(storageArea(columnCount)(rowCount))
//      logPileSorter(storageArea, storageAreaSize, columnCount, rowCount + 1)
//    }
//
//
//
//  }
//  //logPileSorter(createLogPile(3), 3,7)
//
//
//  def createLogPile(storageAreaSize: Int) = {
//
//    val storageArea = Array.ofDim[Int](storageAreaSize, storageAreaSize)
//    storageArea(0)(0) = 1;
//    storageArea(1)(0) = 1;
//    storageArea(2)(0) = 1
//    storageArea(0)(1) = 2;
//    storageArea(1)(1) = 1;
//    storageArea(2)(1) = 3
//    storageArea(0)(2) = 1;
//    storageArea(1)(2) = 4;
//    storageArea(2)(2) = 1
//
//    printStorageArea(storageArea, storageAreaSize)
//    storageArea
//  }
//
//  createLogPile(3)
//
//  def printStorageArea(storageArea: Array[Array[Int]], storageAreaSize: Int): Unit = {
//
//  for (y <- 0 until storageAreaSize) {
//      for (x <- 0 until storageAreaSize) {
//        print(" " + storageArea(x)(y))
//      }
//      println()
//    }
//  }
//
//
//
//}
