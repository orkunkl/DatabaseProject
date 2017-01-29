package DAO

import models.User

import scala.concurrent.Future

/**
  * Created by orkun on 29/01/17.
  */
trait DatabaseControllerTrait {
  def addNewUser(user: User): Future[User]
  def searchUser(username: String) : Future[Option[User]]
}
