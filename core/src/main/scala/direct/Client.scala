package direct

import akka.actor.{Actor, ActorRef, Props}
import akka.io.Tcp._
import akka.util.ByteString

import java.net.InetSocketAddress

object Client {
  def props(remote: InetSocketAddress, replies: ActorRef): Props =
    Props(new Client(remote, replies))
}

class Client(remote: InetSocketAddress, listener: ActorRef) extends Actor {

  //  IO(Tcp) ! Connect(remote)

  def receive = {
    case CommandFailed(_: Connect) =>
      listener ! "connect failed"
      context.stop(self)

    case c@Connected(remote, local) =>
      listener ! c
      val connection = sender()
      connection ! Register(self)
      context.become {
        case data: ByteString =>
          connection ! Write(data)
        case CommandFailed(w: Write) =>
          // O/S buffer was full
          listener ! "write failed"
        case Received(data) =>
          listener ! data
        case "close" =>
          connection ! Close
        case _: ConnectionClosed =>
          listener ! "connection closed"
          context.stop(self)
      }
  }
}