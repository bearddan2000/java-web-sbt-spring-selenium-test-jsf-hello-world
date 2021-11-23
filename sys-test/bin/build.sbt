lazy val root = (project in file("."))
  .settings(

    name := "spring-boot-scalatest-web-selenium",

    version := "1.0",

    scalaVersion := "2.13.1",

    libraryDependencies ++= Seq(
    // https://mvnrepository.com/artifact/com.influxdb/influxdb-client-scala
      "com.influxdb" %% "influxdb-client-scala" % "3.3.0",
      "org.scalatest" %% "scalatest" % "3.2.9" % "test",
      "org.scalatestplus" %% "selenium-3-141" % "3.2.9.0" % "test",
      "org.scalatest" %% "scalatest-flatspec" % "3.2.9" % "test",
      "org.scalatest" %% "scalatest-shouldmatchers" % "3.2.9" % "test"
     )
)
