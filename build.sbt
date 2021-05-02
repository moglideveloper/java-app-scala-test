name := "Java Project"

version := "0.0.1"

// project description
description := "Java Project With Scala Test"

// Enables publishing to maven repo
publishMavenStyle := true

// Do not append Scala versions to the generated artifacts
crossPaths := false

// This forbids including Scala related libraries into the dependency
autoScalaLibrary := false

//adding scala compiler and library in test scope
//to create, compile and run scala files in intellij
libraryDependencies += "org.scala-lang" % "scala-library" % "2.13.5" % Test
libraryDependencies += "org.scala-lang" % "scala-compiler" % "2.13.5" % Test