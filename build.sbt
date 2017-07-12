lazy val root = (project in file(".")).
  settings(
    name := "dotty-example-cats",
    description := "Example sbt project that compiles using Dotty and depends on cats",
    version := "0.1",

    scalaVersion := "0.2.0-RC1",

    libraryDependencies += ("org.typelevel" %% "cats" % "0.9.0").withDottyCompat()
  )
