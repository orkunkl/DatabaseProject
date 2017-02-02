package DAO

import models._
import play.api.db.slick.HasDatabaseConfigProvider
import slick.lifted.{TableQuery, Tag}
import slick.driver.JdbcProfile
import slick.driver.PostgresDriver.api._

/**
  * Created by orkun on 01/02/17.
  */

trait SlickDatabaseMapping { self: HasDatabaseConfigProvider[JdbcProfile] =>
  val AccountTable = TableQuery[AccountsTable]

  class AccountsTable(tag: Tag) extends Table[User](tag, "accounts") {

    def accountID = column[Int]("account_id", O.PrimaryKey, O.AutoInc)
    def username = column[String]("username")
    def password = column[String]("password")
    override def * = (accountID.?, username, password) <> (User.tupled, User.unapply)
  }

  val TweetsTable = TableQuery[TweetsTable]

  class TweetsTable(tag: Tag) extends Table[Tweet](tag, "tweets") {

    def tweetID = column[Int]("tweet_id", O.PrimaryKey, O.AutoInc)
    def tweetOwnerID = column[Int]("tweet_owner_id")
    def tweetOwnerName = column[String]("tweet_owner_name")
    def tweetText = column[String]("tweet_text")
    def locationId = column[Int]("location_id")

    override def * = (tweetID.?, tweetOwnerID, tweetOwnerName, tweetText, locationId.?) <> (Tweet.tupled, Tweet.unapply)
  }

  val HashtagTable = TableQuery[HashtagTable]

  class HashtagTable(tag: Tag) extends Table[Hashtag](tag, "hashtags") {

    def hashtagID = column[Int]("hashtag_id", O.PrimaryKey, O.AutoInc)
    def created_date = column[java.sql.Date]("created_date")
    def hashtagName = column[String]("hashtag_name")

    override def * = (hashtagID.?, created_date, hashtagName) <> (Hashtag.tupled, Hashtag.unapply)
  }

  val LocationTable = TableQuery[LocationTable]

  class LocationTable(tag: Tag) extends Table[Location](tag, "location") {

    def locationID = column[Int]("location_id", O.PrimaryKey, O.AutoInc)
    def name = column[String]("name")

    override def * = (locationID.?, name) <> (Location.tupled, Location.unapply)
  }

  val TrendTable = TableQuery[TrendTable]

  class TrendTable(tag: Tag) extends Table[Trend](tag, "trends") {

    def trendID = column[Int]("trend_id", O.PrimaryKey, O.AutoInc)
    def date = column[java.sql.Date]("date")
    def trendType = column[Boolean]("type")
    def ranking = column[Int]("ranking")
    def trendLink = column[Int]("trend_link")

    override def * = (trendID.?, date, trendType, ranking, trendLink) <> (Trend.tupled, Trend.unapply)
  }

  val LikeTable = TableQuery[LikeTable]

  class LikeTable(tag: Tag) extends Table[Like](tag, "likes") {

    def tweetID = column[Int]("tweet_id")
    def likerID = column[Int]("liker_id")
    def postOwnerID = column[Int]("post_owner_id")
    def date = column[java.sql.Date]("date")

    override def * = (tweetID, likerID, postOwnerID, date) <> (Like.tupled, Like.unapply)
  }

  val HashtagTweetRelationTable = TableQuery[HashtagTweetRelationTable]

  class HashtagTweetRelationTable(tag: Tag) extends Table[HashtagTweetRelation](tag, "hashtag_tweet_relation") {

    def tweetID = column[Int]("tweet_id")
    def hashtagID = column[Int]("hashtag_id")

    override def * = (tweetID, hashtagID) <> (HashtagTweetRelation.tupled, HashtagTweetRelation.unapply)
  }

  val CommentTable = TableQuery[CommentTable]

  class CommentTable(tag: Tag) extends Table[Comment](tag, "comments") {

    def commentID = column[Int]("comment_id", O.AutoInc, O.PrimaryKey)
    def tweetID = column[Int]("tweet_id")
    def commentOwnerID = column[Int]("comment_owner_id")

    override def * = (commentID.?, tweetID, commentOwnerID) <> (Comment.tupled, Comment.unapply)
  }
}
