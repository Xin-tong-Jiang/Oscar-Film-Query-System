/*连接数据库引擎*/
mysql -u root --default-character-set=gbk
/*创建数据库mydb*/
create database mydb default character set gbk;
/*使用数据库mydb*/
use mydb;
/*创建电影信息表*/
create table film_info (
  id varchar(255) primary key, /*电影ID*/
  name varchar(255),           /*名称*/
  template varchar(255),       /*主页模板*/
  prize varchar(255),          /*奖项*/ 
  poster varchar(255),         /*照片*/
  director varchar(255),       /*导演*/
  country varchar(255),        /*国家*/
  summary Text,                /*梗概*/
  releaseDate datetime,        /*上映日期*/
  score varchar(255)           /*豆瓣评分*/
) engine=InnoDB default charset=gbk;
/*插入23条电影信息*/
load data local infile ' C:/Users/蒋欣彤/Desktop/film.csv' into table  film_info fields terminated by ',';