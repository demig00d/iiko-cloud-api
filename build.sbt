val sttpVersion  = "3.9.0"
val circeVersion = "0.14.6"

lazy val root = (project in file("."))
  .settings(
    inThisBuild(
      List(
        organization       := "ru.restomatik",
        scalaVersion       := "2.13.12",
        crossScalaVersions := Seq(scalaVersion.value, "2.12.17"),
      )
    ),
    name := "iiko-cloud-api",
    libraryDependencies ++= Seq(
      "com.softwaremill.sttp.client3" %% "core"          % sttpVersion,
      "com.softwaremill.sttp.client3" %% "circe"         % sttpVersion,
      "io.circe"                      %% "circe-generic" % circeVersion,
    ),
  )
  .enablePlugins(JavaAppPackaging)
