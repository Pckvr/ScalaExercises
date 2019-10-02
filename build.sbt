name := "ScalaExercises"

version := "0.1"

scalaVersion := "2.12.8"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % Test

libraryDependencies += "org.mockito" % "mockito-core" % "2.7.22" % Test

libraryDependencies ++= Seq(
  "org.slf4j" % "slf4j-log4j12" % "1.7.25",
  "org.mongodb.scala" %% "mongo-scala-driver" % "2.6.0"
)

