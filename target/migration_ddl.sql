
CREATE TABLE public.Accounts
(
  account_id SERIAL PRIMARY KEY,
  username character varying,
  password character varying
);

CREATE TABLE public.Tweets
(
  tweet_id SERIAL PRIMARY KEY,
  tweet_owner_id integer,
  tweet_owner_name character varying,
  tweet_text character varying,
  location_id integer,
  CONSTRAINT tweet_owner_id FOREIGN KEY (tweet_owner_id)
    REFERENCES public.Accounts (account_id) MATCH SIMPLE
    ON UPDATE NO ACTION ON DELETE CASCADE
);

CREATE TABLE public.Likes
(
  tweet_id integer,
  liker_id integer,
  post_owner_id integer,
  date date,
  FOREIGN KEY (liker_id) REFERENCES public.Accounts(account_id) ON DELETE CASCADE,
  FOREIGN KEY (tweet_id) REFERENCES public.Tweets(tweet_id) ON DELETE CASCADE
);

CREATE TABLE public.Hashtags
(
  hashtag_id SERIAL PRIMARY KEY,
  created_date date,
  hashtag_name character varying
);

CREATE TABLE public.Trends
(
  trend_id SERIAL PRIMARY KEY,
  date date,
  type boolean,
  ranking integer,
  trend_link integer,
  FOREIGN KEY (trend_id) REFERENCES public.Hashtags(hashtag_id) ON DELETE CASCADE
);

CREATE TABLE public.Location
(
  Location_id SERIAL PRIMARY KEY,
  name character varying
);

CREATE TABLE public.Comments
(
  comment_id SERIAL PRIMARY KEY,
  tweet_id integer,
  comment_owner_id integer,
  FOREIGN KEY (tweet_id) REFERENCES public.Tweets (tweet_id) ON DELETE CASCADE,
  FOREIGN KEY (comment_owner_id) REFERENCES public.Accounts (account_id) MATCH SIMPLE ON UPDATE CASCADE ON DELETE CASCADE
);
CREATE TABLE public.Hashtag_Tweet_Relation
(
  tweet_id integer,
  hashtag_id integer,
  FOREIGN KEY (tweet_id) REFERENCES public.Tweets (tweet_id) ON DELETE CASCADE,
  FOREIGN KEY (hashtag_id) REFERENCES public.Hashtags (hashtag_id) MATCH SIMPLE ON UPDATE CASCADE ON DELETE CASCADE
);

