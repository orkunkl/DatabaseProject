package models

/**
  * Created by orkun on 31/01/17.
  */
case class Trend (trendID: Option[Int], date: java.sql.Date, trendType: Boolean, ranking: Int, trendLink: Int)
