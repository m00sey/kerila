ThisBuild / scalaVersion := "2.13.4"
ThisBuild / version := "0.1"

lazy val root = (project in file("."))
  .aggregate(demo, core)
  .dependsOn(demo, core)
  .settings(settings)

lazy val demo = (project in file("demo"))
  .aggregate(core)
  .dependsOn(core)
  .settings(
    name := "kerila demos",
    settings,
    libraryDependencies ++= commonDependencies
  )

lazy val core = (project in file("core"))
  .settings(
    name := "kerila core",
    settings,
    libraryDependencies ++= commonDependencies
  )

lazy val dependencies =
  new {
    val tinkV = "1.5.0"
    val jnaV = "5.7.0"
    val lazyV = "4.3.4"
    val scalatestV = "3.2.4"
    val scalacheckV = "1.15.3"
    val eddsaV = "0.3.0"
    val enumeratumVersion = "1.6.1"
    val akkaVersion = "2.6.12"
    val rocksdbVersion = "5.0.1"
    val blake3Version = "0.2.0"

    val tink = "com.google.crypto.tink" % "tink" % tinkV
    val jna = "net.java.dev.jna" % "jna" % jnaV
    val libsodium = "com.goterl.lazycode" % "lazysodium-java" % lazyV
    val eddsa = "net.i2p.crypto" % "eddsa" % eddsaV
    val enumeratum = "com.beachape" %% "enumeratum" % enumeratumVersion
    val akka = "com.typesafe.akka" %% "akka-actor" % akkaVersion
    val rocksdb = "org.rocksdb" % "rocksdbjni" % rocksdbVersion
    val scalatest = "org.scalatest" %% "scalatest" % scalatestV
    val scalacheck = "org.scalacheck" %% "scalacheck" % scalacheckV
    val blake3 = "org.alephium" %% "blake3-jni" % blake3Version
  }

lazy val commonDependencies = Seq(
  dependencies.tink,
  dependencies.jna,
  dependencies.libsodium,
  dependencies.eddsa,
  dependencies.enumeratum,
  dependencies.akka,
  dependencies.rocksdb,
  dependencies.blake3,
  dependencies.scalatest % Test,
  dependencies.scalacheck % Test,
)

lazy val settings = Seq(
  resolvers ++= Seq(
    "Local Maven Repository" at "file://" + Path.userHome.absolutePath + "/.m2/repository",
    Resolver.jcenterRepo,
    Resolver.mavenCentral,
  )
)