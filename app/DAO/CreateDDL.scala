package DAO

import java.io.PrintWriter
import javax.inject.Inject

import play.api.db.slick.{HasDatabaseConfigProvider, DatabaseConfigProvider}
import slick.driver.JdbcProfile


/**
  * Creates DDL script
  */
class CreateDDL @Inject()(protected val dbConfigProvider: DatabaseConfigProvider, databaseController: DatabaseController) extends HasDatabaseConfigProvider[JdbcProfile] with SlickDatabaseMapping  {
  def createDDLScript() = {
    import slick.driver.PostgresDriver.api._

    val allSchemas = AccountTable.schema ++ TweetsTable.schema ++ TrendTable.schema ++ LocationTable.schema ++ HashtagTable.schema ++ HashtagTweetRelationTable.schema ++ LikeTable.schema

    val writer = new PrintWriter("target/migration_ddl.sql")
    writer.write("# --- !Ups\n\n")
    allSchemas.createStatements.foreach { s => writer.write(s + ";\n") }

    writer.write("\n\n# --- !Downs\n\n")
    allSchemas.dropStatements.foreach { s => writer.write(s + ";\n") }

    writer.close()
  }

  createDDLScript()
}