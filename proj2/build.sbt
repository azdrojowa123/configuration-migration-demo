ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.14"


lazy val root = (project in file("."))
  .settings(
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.2.18" % Test,
      "junit" % "junit" % "4.13.2" % Test
    )
  )

lazy val foo = (project in file("foo"))
  .dependsOn(root % "test -> test")