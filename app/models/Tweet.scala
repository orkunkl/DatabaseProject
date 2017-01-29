package models

/**
  * Created by orkun on 29/01/17.
  */
case class Tweet(tweetID : Int, tweetOwnerID: Int, tweetOwnerName: String, tweetText: String, totalLikes: Int, locationId: Int)
