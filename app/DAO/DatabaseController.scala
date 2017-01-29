package DAO

import com.google.inject.Inject
import play.api.db.slick.DatabaseConfigProvider

/**
  * Created by orkun on 29/01/17.
  */
class DatabaseController @Inject()(protected val dbConfigProvider: DatabaseConfigProvider) extends DatabaseControllerTrait{

}
