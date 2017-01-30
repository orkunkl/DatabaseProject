package DAO

import models.{Tweet, User}

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

  /**
    * Tweet table
    */
  def getTweets : Future[List[Tweet]]
}
