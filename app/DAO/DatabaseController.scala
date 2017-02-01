package DAO

import com.google.inject.Inject
import models._
import slick.lifted.{TableQuery, Tag}
import play.api.db.slick.{DatabaseConfigProvider, HasDatabaseConfigProvider}
import slick.driver.JdbcProfile
import slick.driver.PostgresDriver.api._
import play.api.libs.concurrent.Execution.Implicits.defaultContext
import views.viewForms.tweetForm

import scala.collection.mutable.ArrayBuffer
import scala.concurrent.Future


/**
  * Created by orkun on 29/01/17.
  */
class DatabaseController @Inject()(protected val dbConfigProvider: DatabaseConfigProvider) extends HasDatabaseConfigProvider[JdbcProfile] with DatabaseControllerTrait with SlickDatabaseMapping {

  /**
    *
    * ACCOUNT TABLE RELATED THINGS
    *
    * */


  override def addNewUser(user: User): Future[User] = db.run(AccountTable.returning(AccountTable.map(user => user)) += user)

  override def searchUser(username: String): Future[Option[User]] = db.run(AccountTable.filter(_.username===username).result.headOption)


  /**
    *
    * TWEET TABLE RELATED THINGS
    *
    * */



  override def getTweets : Future[List[Tweet]] = db.run(TweetsTable.result).map(_.toList)

  override def insertTweet(tweet: Tweet): Future[Int] = db.run(TweetsTable.returning(TweetsTable.map(tweet => tweet.tweetID)) += tweet)

  /**
    *
    *   HASHTAG RELATED THINGS
    *
    * */


  override def insertHashtag (hashtag: Hashtag): Future[Int] = db.run(HashtagTable.returning(HashtagTable.map(_.hashtagID)) += hashtag)
  override def checkHashtag(hashtag: String) : Future[Option[Hashtag]] = db.run(HashtagTable.filter(_.hashtagName===hashtag).result.headOption)

  /**
    *
    *   LOCATION RELATED THINGS
    *
    * */


  override def getLocation (locationName: String) : Future[Option[Location]] = db.run(LocationTable.filter(_.name === locationName).result.headOption)
  override def insertLocation (location: Location) : Future[Int] = db.run(LocationTable.returning(LocationTable.map(location => location)) += location).map{_.locationID.get}

  /**
    *
    *   TRENDS RELATED THINGS
    *
    * */


  /**
    *
    *   LIKE RELATED THINGS
    *
    * */
  override def likeTweet (like: Like) : Future[Unit] = db.run(LikeTable += like).map { _ => ()}

  /**
    *
    *   HASHTAG_TWEET_RELATION
    *
    * */


  override def insertRelation (hashtagTweetRelation: ArrayBuffer[HashtagTweetRelation]) : Future[Unit] = db.run(HashtagTweetRelationTable ++= hashtagTweetRelation).map { _ => ()}

}
