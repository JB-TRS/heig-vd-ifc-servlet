name := """SwitchMonitor"""
organization := "com.heig-vd.ifc"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.11"

libraryDependencies += filters

libraryDependencies ++= Seq(
  javaWs
)
