# --- !Ups

create table "accounts" ("account_id" SERIAL NOT NULL PRIMARY KEY,"username" VARCHAR NOT NULL,"password" VARCHAR NOT NULL);
create table "tweets" ("tweet_id" SERIAL NOT NULL PRIMARY KEY,"tweet_owner_id" INTEGER NOT NULL,"tweet_owner_name" VARCHAR NOT NULL,"tweet_text" VARCHAR NOT NULL,"location_id" INTEGER NOT NULL);
create table "trends" ("trend_id" SERIAL NOT NULL PRIMARY KEY,"date" DATE NOT NULL,"type" BOOLEAN NOT NULL,"ranking" INTEGER NOT NULL);
create table "locations" ("location_id" SERIAL NOT NULL PRIMARY KEY,"name" VARCHAR NOT NULL);
create table "hashtags" ("hashtag_id" SERIAL NOT NULL PRIMARY KEY,"created_date" DATE NOT NULL,"hashtag_name" VARCHAR NOT NULL);
create table "hashtag_tweet_relation" ("tweet_id" INTEGER NOT NULL,"hashtag_id" INTEGER NOT NULL);
create table "likes" ("tweet_id" INTEGER NOT NULL,"liker_id" INTEGER NOT NULL,"post_owner_id" INTEGER NOT NULL,"date" DATE NOT NULL);


# --- !Downs

drop table "likes";
drop table "hashtag_tweet_relation";
drop table "hashtags";
drop table "locations";
drop table "trends";
drop table "tweets";
drop table "accounts";
