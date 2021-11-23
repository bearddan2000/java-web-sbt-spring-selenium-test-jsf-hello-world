lazy val root = (project in file("."))
  .settings(
  // Project name (artifact name in Maven)
  name := "(java-web-sbt)",

  version := "1.0-SNAPSHOT",

  // Do not append Scala versions to the generated artifacts
  crossPaths := false,

  // This forbids including Scala related libraries into the dependency
  autoScalaLibrary := false,

  libraryDependencies ++= Seq(
    "org.springframework.boot" % "spring-boot-starter-web" % "2.4.2",
    // https://mvnrepository.com/artifact/javax.enterprise/cdi-api
    "org.joinfaces" % "primefaces-spring-boot-starter" % "4.3.12",
    "javax.enterprise" % "cdi-api" % "1.2" % "provided"
   ),

  mainClass := Some("example.MyApp")
)
