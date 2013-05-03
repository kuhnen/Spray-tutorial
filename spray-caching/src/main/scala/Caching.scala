import akka.actor.ActorSystem
import spray.caching.{LruCache, Cache}
import scala.concurrent.Future
import spray.util._

object Caching {

  def main(args: Array[String]): Unit = {
    
    implicit val system = ActorSystem()
    def expensiveOp() = {
    	Thread.sleep(5000)
      new util.Random().nextDouble()
      
    }
    
    
    val cache: Cache[Double] = LruCache()
    
    def cachedOp[T](key: T): Future[Double] = cache(key) {
      expensiveOp()
    }
   println(cachedOp("foo").await)
    val a =cachedOp("foo").await == cachedOp("foo").await
   // val b =cachedOp("bar").await != cachedOp("foo").await
    println(cachedOp("foo").await)
   println(a)
  // println(b)
   
   system.shutdown()
    
  }

}