ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.14"

val proj2 = ProjectRef(file("proj2"), "root")

lazy val root = (project in file("."))
  .settings(
    name := "configuration-migration-demo"
  ).dependsOn(proj2)

lazy val foo = (project in file("foo"))
  .settings(
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.2.18" % Test,
      "junit" % "junit" % "4.13.2" % "test"
    )
  )