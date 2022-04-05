// Sample build.sbt.
// Note:
//   Blank lines need to separate the statements.
//   := means you are setting the value for that key
//   += means you are adding to the values for that key

name := "Scala-99"

version := "0.1"

organization := "MyMegaCorp"

scalaVersion := "2.13.8"
sbtVersion := "1.4.9"

// Dependencies
libraryDependencies += "org.scala-lang.modules" %% "scala-parser-combinators" % "2.1.1"

// Command Line Parser - https://github.com/scopt/scopt
libraryDependencies += "com.github.scopt" %% "scopt" % "4.0.1"

// Test Framework
libraryDependencies += "org.scalatest" %% "scalatest"          % "3.2.11" % "test"
libraryDependencies += "org.scalatest" %% "scalatest-funsuite" % "3.2.11" % "test"
