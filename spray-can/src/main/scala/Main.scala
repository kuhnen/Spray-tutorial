import akka.actor.ActorSystem
import akka.actor.IO
import spray.can.server.HttpServer
import spray.can.HttpEvent
import spray.io.IOExtension
import spray.can.server.SprayCanHttpServerApp
import akka.actor.Actor
import akka.actor.Props
import spray.http.HttpResponse

object Main extends App with SprayCanHttpServerApp {

  val ioBridge = IOExtension(system).ioBridge()
  val handler = system.actorOf(Props[Handler])
  newHttpServer(handler) ! Bind(interface="localhost", port= 8080)
  //system.shutdown()

}

class Handler extends Actor {
	
  def receive = {
    case a => sender ! HttpResponse(entity = "PONG!")
  }
  
}