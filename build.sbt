name := "scala-2.12.4"

scalaVersion  := "2.12.4"

scalacOptions += "-Ywarn-unused:privates"

libraryDependencies ++=
  "org.sangria-graphql"           %% "sangria"                % "1.3.2"                  ::
  Nil
