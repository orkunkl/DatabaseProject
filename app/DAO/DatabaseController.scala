package DAO

import com.google.inject.Inject
import models.User
import slick.lifted.{TableQuery, Tag}
import play.api.db.slick.{DatabaseConfigProvider, HasDatabaseConfigProvider}
import slick.driver.JdbcProfile
import slick.driver.PostgresDriver.api._
import play.api.libs.concurrent.Execution.Implicits.defaultContext

import scala.concurrent.Future


/**
  * Created by orkun on 29/01/17.
  */
class DatabaseController @Inject()(protected val dbConfigProvider: DatabaseConfigProvider) extends HasDatabaseConfigProvider[JdbcProfile] with DatabaseControllerTrait{

  override def addNewUser(user: User): Future[User] = db.run(AccountTable.returning(AccountTable.map(user => user)) += user)

  override def searchUser(username: String): Future[Option[User]] = db.run(AccountTable.filter(_.username===username).result.headOption)



  private val AccountTable = TableQuery[AccountsTable]

  private class AccountsTable(tag: Tag) extends Table[User](tag, "Accounts") {

    def accountID = column[Int]("account_id", O.PrimaryKey, O.AutoInc)
    def username = column[String]("username")
    def password = column[String]("password")
    def totalLikes = column[Int]("total_likes", O.Default(0))
    override def * = (accountID.?, username, password, totalLikes) <> (User.tupled, User.unapply)

  }

}
