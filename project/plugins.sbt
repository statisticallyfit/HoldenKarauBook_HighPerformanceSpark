addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "0.8.0")

resolvers += "sonatype-releases" at "https://oss.sonatype.org/content/repositories/releases/"

resolvers += "sonatype-snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"




//tag::addSparkPackagesPlugin[]
//resolvers += "Spark Package Main Repo" at "https://dl.bintray.com/spark-packages/maven"

//resolvers += "bintray-spark-packages" at "https://dl.bintray.com/spark-packages/maven/" 

resolvers += "spark-packages" at "https://repos.spark-packages.org/"

//resolvers += Resolver.url("bintray-spark-packages", url("http://dl.bintray.com/spark-packages/maven/"))(Resolver.ivyStylePatterns)


// TODO doesn't load sbt. Tried debugging as per https://github.com/databricks/sbt-spark-package/issues/9

addSbtPlugin("org.spark-packages" % "sbt-spark-package" % "0.2.5")
//end::addSparkPackagesPlugin[]

//addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.0.0")

addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.5.0")

//tag::sbtJNIPlugin[]
addSbtPlugin("ch.jodersky" %% "sbt-jni" % "1.0.0-RC3")
//end::sbtJNIPlugin[]

addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "0.8.0")
