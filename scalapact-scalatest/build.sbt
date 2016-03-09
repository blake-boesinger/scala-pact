
name := "scalapact-scalatest"

organization := "com.itv"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "org.scalatest" % "scalatest_2.11" % "2.2.4" % "test",
  "org.json4s" %% "json4s-native" % "3.3.0" % "test",
  "com.github.tomakehurst" % "wiremock" % "1.56",
  "org.scalaj" %% "scalaj-http" % "1.1.5",
  "com.typesafe.scala-logging" %% "scala-logging" % "3.1.0",
  "ch.qos.logback" % "logback-classic" % "1.0.3",
  "com.itv" % "scalapact-core_2.11" % "0.1.13"
)

resolvers += "ITV Repo" at " http://itvrepos.artifactoryonline.com/itvrepos/cps-libs"

publishTo := Some("Artifactory Realm" at "https://itvrepos.artifactoryonline.com/itvrepos/cps-libs")
