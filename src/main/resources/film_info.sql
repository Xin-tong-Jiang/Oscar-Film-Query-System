/*�������ݿ�����*/
mysql -u root --default-character-set=gbk
/*�������ݿ�mydb*/
create database mydb default character set gbk;
/*ʹ�����ݿ�mydb*/
use mydb;
/*������Ӱ��Ϣ��*/
create table film_info (
  id varchar(255) primary key, /*��ӰID*/
  name varchar(255),           /*����*/
  template varchar(255),       /*��ҳģ��*/
  prize varchar(255),          /*����*/ 
  poster varchar(255),         /*��Ƭ*/
  director varchar(255),       /*����*/
  country varchar(255),        /*����*/
  summary Text,                /*����*/
  releaseDate datetime,        /*��ӳ����*/
  score varchar(255)           /*��������*/
) engine=InnoDB default charset=gbk;
/*����23����Ӱ��Ϣ*/
load data local infile ' C:/Users/����ͮ/Desktop/film.csv' into table  film_info fields terminated by ',';