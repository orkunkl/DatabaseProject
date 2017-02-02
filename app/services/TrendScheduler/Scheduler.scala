package services.TrendScheduler

import akka.actor.{ActorRef, ActorSystem, Props}
import com.google.inject.Inject
import com.google.inject.name.Named
import com.typesafe.akka.extension.quartz.QuartzSchedulerExtension

import scala.concurrent.ExecutionContext

/**
  * Created by orkun on 01/02/17.
  */
class Scheduler @Inject() (val system: ActorSystem, @Named("scheduler-actor") configuredActor: ActorRef)(implicit ec: ExecutionContext)
{
  QuartzSchedulerExtension(system).schedule("OnceInNight",configuredActor,"update")

}