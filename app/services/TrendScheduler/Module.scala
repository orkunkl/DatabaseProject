package services.TrendScheduler

import akka.actor.Scheduler
import com.google.inject.AbstractModule
import play.api.libs.concurrent.AkkaGuiceSupport

/**
  * Created by orkun on 01/02/17.
  */
class Module extends AbstractModule with AkkaGuiceSupport {
  def configure() = {
    bindActor[SchedulerActor]("scheduler-actor")
    bind(classOf[Scheduler]).asEagerSingleton()
  }
}

