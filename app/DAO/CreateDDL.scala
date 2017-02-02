package DAO

import java.io.PrintWriter
import javax.inject.Inject

import play.api.db.slick.{DatabaseConfigProvider, HasDatabaseConfigProvider}
import slick.driver.JdbcProfile
import scala.io.Source
import slick.driver.PostgresDriver.api._


/**
  * Creates DDL script
  */
class CreateDDL @Inject()(protected val dbConfigProvider: DatabaseConfigProvider, databaseController: DatabaseController) extends HasDatabaseConfigProvider[JdbcProfile] with SlickDatabaseMapping  {
  def createDDLScript() = {



  }
  val fileContents = Source.fromFile("target/migration_ddl.sql").getLines.mkString
  createDDLScript()
}