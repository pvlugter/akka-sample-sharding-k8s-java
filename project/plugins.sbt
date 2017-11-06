addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.2.0")

addSbtPlugin("com.lightbend.cinnamon" % "sbt-cinnamon" % "2.6.0-20171102-4cd5b64-prometheus")
resolvers += Resolver.url("lightbend-commercial", url("https://repo.lightbend.com/commercial-releases"))(Resolver.ivyStylePatterns)
credentials += Credentials(Path.userHome / ".lightbend" / "commercial.credentials")
