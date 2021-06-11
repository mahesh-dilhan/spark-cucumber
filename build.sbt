lazy val commonSettings = Seq(
  version := "0.1.0",
  // set the Scala version used for the project.  2.11 isn't supported with Spark yet
  scalaVersion := "2.11.12"
)

val spark = "org.apache.spark" % "spark-core" % "2.4.0"
val sparkSql = "org.apache.spark" % "spark-sql" % "2.4.0"



lazy val root = (project in file(".")).
  settings(commonSettings: _*).
  settings(
    name := "spark-cucumber"
  ).
  settings(
    libraryDependencies += spark,
    libraryDependencies += sparkSql,
    libraryDependencies +="io.cucumber" % "cucumber-core" % "2.0.1",
    libraryDependencies += "io.cucumber" % "cucumber-scala" % "2.0.1",
    libraryDependencies +="com.waioeka.sbt" % "cucumber-runner" % "0.1.3",
    libraryDependencies +="org.scalactic" % "scalactic" % "3.0.5",
    libraryDependencies += "org.scalatest" % "scalatest" % "3.0.5"
  )