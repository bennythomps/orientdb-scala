name := """hello-scala"""

version := "1.0"

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
    "com.orientechnologies" % "orient-commons" % "2.0-M1",
    "com.orientechnologies" % "orientdb-core" % "2.0-M1",
    "org.scalatest" %% "scalatest" % "2.1.6" % "test"
)
