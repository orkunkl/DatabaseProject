name := """databaseProject"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  "org.webjars" %% "webjars-play" % "2.5.0",
  "org.scalatestplus.play" %% "scalatestplus-play" % "1.5.1" % Test,
  "com.typesafe.play" %% "play-slick" % "2.0.2",
  "org.postgresql" % "postgresql" % "9.4.1212.jre7",
  "com.adrianhurt" %% "play-bootstrap" % "1.1-P25-B3",
  "org.webjars" % "bootstrap" % "3.3.6",
  "com.enragedginger" %% "akka-quartz-scheduler" % "1.6.0-akka-2.4.x"
)

fork in run := true
