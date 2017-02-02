package services.TrendScheduler

import java.util.Calendar

import DAO.DatabaseController
import akka.actor.Actor
import com.google.inject.Inject
import models.{Hashtag, Trend, Tweet}
import play.api.Logger

import scala.concurrent.{ExecutionContext, Future}

/**
  * Created by orkun on 01/02/17.
  */
class SchedulerActor @Inject() (Database: DatabaseController)(implicit ex: ExecutionContext) extends Actor {
  def receive = {
    case "update" => updateDB()
  }

  def updateDB(): Unit ={
    val tweetsFuture = Database.getTop10Tweets
    val hashtagsFuture = Database.getTop10Hashtag
    for{
      tweets <- tweetsFuture
      hashtags <- hashtagsFuture
    } yield {
      var rankCounter = 0
      val trendTweets: Seq[Trend] = tweets.map( tweet => {
        rankCounter += 1
        Trend(None,new java.sql.Date(Calendar.getInstance().getTime().getTime()), false, rankCounter, tweet.tweetID.get)
      })
      Database.insertTrends(trendTweets)

      rankCounter = 0
      val trendHashtags = hashtags.map( hashtag => {
        rankCounter += 1
        Trend(None,new java.sql.Date(Calendar.getInstance().getTime().getTime()), false, rankCounter, hashtag.hashtagID.get)
      })
    }
  }
}