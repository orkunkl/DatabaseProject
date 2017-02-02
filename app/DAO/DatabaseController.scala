package DAO

import com.google.inject.Inject
import models._
import play.api.db.slick.{DatabaseConfigProvider, HasDatabaseConfigProvider}
import slick.driver.JdbcProfile
import slick.driver.PostgresDriver.api._
import play.api.libs.concurrent.Execution.Implicits.defaultContext
import akka.actor.ActorSystem

import scala.collection.mutable.{ArrayBuffer, ListBuffer}
import scala.concurrent.Future


/**
  * Created by orkun on 29/01/17.
  */
class DatabaseController @Inject()(protected val dbConfigProvider: DatabaseConfigProvider, val system: ActorSystem) extends HasDatabaseConfigProvider[JdbcProfile] with DatabaseControllerTrait with SlickDatabaseMapping {

  /**
    *
    * ACCOUNT TABLE RELATED THINGS
    *
    * */


  override def addNewUser(user: User): Future[User] = db.run(AccountTable.returning(AccountTable.map(user => user)) += user)

  override def searchUser(username: String): Future[Option[User]] = db.run(AccountTable.filter(_.username===username).result.headOption)

  override def deleteAccount(accoutID: Int) : Future[Unit] = db.run(AccountTable.filter(_.accountID === accoutID).delete).map { _ => ()}

  /**
    *
    * TWEET TABLE RELATED THINGS
    *
    * */



  override def getTweets : Future[List[Tweet]] = db.run(TweetsTable.result).map(_.toList)
  override def insertTweet(tweet: Tweet): Future[Int] = db.run(TweetsTable.returning(TweetsTable.map(tweet => tweet.tweetID)) += tweet)
  def getTweetByID(tweetID : Int) : Future[Tweet] = db.run(TweetsTable.filter(_.tweetID === tweetID).result.headOption).map(_.get)
  /**
    *
    *   HASHTAG RELATED THINGS
    *
    * */

  override def insertHashtag (hashtag: Hashtag): Future[Int] = db.run(HashtagTable.returning(HashtagTable.map(hashtag => hashtag.hashtagID)) += hashtag)
  override def checkHashtag (hashtag: String) : Future[Option[Hashtag]] = db.run(HashtagTable.filter(_.hashtagName===hashtag).result.headOption)
  def getHashtagByID (hashtagID: Int) : Future[Hashtag] = db.run(HashtagTable.filter(_.hashtagID === hashtagID).result.headOption).map(_.get)
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

  def insertTrends (trends: Seq[Trend]): Future[Unit] = db.run(TrendTable ++= trends).map { _ => () }

  def getTop10Hashtag : Future[Seq[Hashtag]] = {
    for{
      query <- db.run(TrendTable.filter(_.trendType===false).sortBy(_.ranking.desc).take(10).result)
    } yield {
      val seq = new ListBuffer[Hashtag]
      query.foreach(x => seq :+ getHashtagByID(x.trendLink))
      seq
    }
   }

  def getTop10Tweets : Future[Seq[Tweet]] ={
    for{
      query <- db.run(TrendTable.filter(_.trendType===true).sortBy(_.ranking.desc).take(5).result)
    } yield {
      val seq = new ListBuffer[Tweet]
      query.foreach(x => seq :+ getTweetByID(x.trendLink))
      seq
    }
  }

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

  override def insertRelation (hashtagTweetRelation: ArrayBuffer[HashtagTweetRelation]) : Future[Unit] = {
    if(!hashtagTweetRelation.isEmpty)
      db.run(HashtagTweetRelationTable ++= hashtagTweetRelation).map { _ => ()}
    else
      Future(Unit)
  }

  /**
    *
    *   COMMENT RELATED THINGS
    *
    * */

  override def insertComment (comment: Comment): Future[Unit] = db.run(CommentTable += comment).map { _ => ()}
}
