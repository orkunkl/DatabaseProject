package DAO

import models._

import scala.collection.mutable.ArrayBuffer
import scala.concurrent.Future

/**
  * Created by orkun on 29/01/17.
  */
trait DatabaseControllerTrait {

  /**
    *   Account Table
    * */
  def addNewUser(user: User): Future[User]
  def searchUser(username: String) : Future[Option[User]]
  def deleteAccount(accoutID: Int) : Future[Unit]

  /**
    * Tweet table
    */
  def getTweets : Future[List[Tweet]]
  def insertTweet(tweet: Tweet): Future[Int]

  /**
    *   Hashtag Table
    * */
  def insertHashtag (hashtag: Hashtag): Future[Int]
  def checkHashtag(hashtag: String) : Future[Option[Hashtag]]

  /**
    *   Location Table
    * */
  def getLocation (locationName: String) : Future[Option[Location]]
  def insertLocation (location: Location) : Future[Int]

  /**
    *   Hashtag-Tweet Relation Table
    * */
  def insertRelation (hashtagTweetRelation: ArrayBuffer[HashtagTweetRelation]) : Future[Unit]

  /**
    * Like Table
    **/
  def likeTweet (like: Like) : Future[Unit]

  /**
    *   Comment Table
    * */
  def insertComment (comment: Comment): Future[Unit]

}
