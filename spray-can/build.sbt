	name := "spray_can"
	
	organization := "com.kuhnen"
	
	version := "0.1.0-SNAPSHOT"
	
	scalaVersion := "2.10.1"
	
	resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

        resolvers += "spray repo" at "http://repo.spray.io"

        libraryDependencies ++= Seq(
         "io.spray" % "spray-can" % "1.1-M7",
         "io.spray" % "spray-caching" % "1.1-M7",
	"ch.qos.logback" % "logback-classic" % "1.0.7",
 	"com.typesafe.akka" %% "akka-slf4j" % "2.1.2",
 	"com.typesafe.akka" %% "akka-actor" % "2.1.2"			
         )

	libraryDependencies ++= Seq(
	  "org.scalatest" % "scalatest_2.10" % "1.9.1" % "test",
	  "com.typesafe.slick" %% "slick" % "1.0.0",
	  "org.xerial" % "sqlite-jdbc" % "3.7.2",
	  "org.slf4j" % "slf4j-nop" % "1.6.4",
	  "org.apache.commons" % "commons-email" % "1.3.1",      
	  "org.subethamail" % "subethasmtp" % "3.1.7",      
	  "org.ccil.cowan.tagsoup" % "tagsoup" % "1.2.1",
	  "com.typesafe.akka" % "akka-actor_2.10" % "2.1.2"           
	)
	
	maxErrors := 10
	
	javacOptions := Seq("-g", "-source", "1.7", "-target", "1.7", "-encoding", "utf8")
	
	scalacOptions := Seq("-unchecked", "-optimise", "-feature", "-deprecation", "-Xcheckinit", "-encoding", "utf8")
	
	
	libraryDependencies ++= Seq(
	  // just for the core library
	  "org.scalesxml" %% "scales-xml" % "0.4.4", 
	  // and additionally use these for String based XPaths
	  "org.scalesxml" %% "scales-jaxen" % "0.4.4" intransitive(),
	  "jaxen" % "jaxen" % "1.1.3" intransitive()
	)
	  
	//libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.0.11"
	                     
	libraryDependencies += "org.slf4j" % "slf4j-api" % "1.7.5"
	            
	//libraryDependencies += "org.slf4j" % "slf4j-simple" % "1.7.5"
	
	initialCommands := "import com.kuhnen.ufsc_crawler._"
