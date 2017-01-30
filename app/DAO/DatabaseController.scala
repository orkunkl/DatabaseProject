package DAO

import com.google.inject.Inject
import models._
import slick.lifted.{TableQuery, Tag}
import play.api.db.slick.{DatabaseConfigProvider, HasDatabaseConfigProvider}
import slick.driver.JdbcProfile
import slick.driver.PostgresDriver.api._
import play.api.libs.concurrent.Execution.Implicits.defaultContext

import scala.concurrent.Future


/**
  * Created by orkun on 29/01/17.
  */
class DatabaseController @Inject()(protected val dbConfigProvider: DatabaseConfigProvider) extends HasDatabaseConfigProvider[JdbcProfile] with DatabaseControllerTrait {

  /**
    *
    * ACCOUNT TABLE RELATED THINGS
    *
    * */

  private val AccountTable = TableQuery[AccountsTable]

  private class AccountsTable(tag: Tag) extends Table[User](tag, "accounts") {

    def accountID = column[Int]("account_id", O.PrimaryKey, O.AutoInc)
    def username = column[String]("username")
    def password = column[String]("password")
    def totalLikes = column[Int]("total_likes", O.Default(0))
    override def * = (accountID.?, username, password, totalLikes) <> (User.tupled, User.unapply)

  }
  override def addNewUser(user: User): Future[User] = db.run(AccountTable.returning(AccountTable.map(user => user)) += user)

  override def searchUser(username: String): Future[Option[User]] = db.run(AccountTable.filter(_.username===username).result.headOption)


  /**
    *
    * TWEET TABLE RELATED THINGS
    *
    * */

  private val TweetsTable = TableQuery[TweetsTable]

  private class TweetsTable(tag: Tag) extends Table[Tweet](tag, "tweets") {

    def tweetID = column[Int]("tweet_id", O.PrimaryKey, O.AutoInc)
    def tweetOwnerID = column[Int]("tweet_owner_id")
    def tweetOwner = column[String]("tweet_owner")
    def tweetText = column[String]("tweet_text")
    def totalLikes = column[Int]("total_likes", O.Default(0))
    def locationId = column[Int]("location_id")

    override def * = (tweetID.?, tweetOwnerID, tweetOwner, tweetText, totalLikes, locationId) <> (Tweet.tupled, Tweet.unapply)
  }

  override def getTweets : Future[List[Tweet]] = db.run(TweetsTable.result).map(_.toList)
}
