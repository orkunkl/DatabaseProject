package DAO

import com.google.inject.AbstractModule

/**
  * Created by orkun on 02/02/17.
  */

class DatabaseInitializer extends AbstractModule {

  override def configure() = {
    // Use the system clock as the default implementation of Clock
    bind(classOf[CreateDDL]).asEagerSingleton()
    // Ask Guice to create an instance of ApplicationTimer when the
    // application starts.
    // Set AtomicCounter as the implementation for Counter.
  }

}