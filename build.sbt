ThisBuild / version := "1.0.9"

ThisBuild / scalaVersion := "2.12.17"

lazy val root = (project in file("."))
  .settings(
    name := "database-access-01"
  )


libraryDependencies ++= Seq(
  "org.scalikejdbc" %% "scalikejdbc" % "4.0.0" ,

  "org.postgresql" % "postgresql" % "42.5.1"  ,

  //This is for log
  "ch.qos.logback" % "logback-classic" % "1.2.3"
)
