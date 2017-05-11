
name := "credit-prediction"

version := "1.0"

scalaVersion := "2.12.2"


libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "2.1.2",
  "org.apache.spark" %% "spark-sql" % "2.1.2",
  "org.apache.spark" %% "spark-hive" % "2.1.2",
  "org.apache.spark" %% "spark-streaming" % "2.1.2",
  "org.apache.spark" %% "spark-mllib" % "2.1.2",
  "com.databricks" %% "spark-csv" % "1.5.0"
)

resolvers ++= Seq(
  "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/",
  "Maven Central" at "https://repo1.maven.org/maven2/"
)