-- 创建数据库
create database suaee;

use suaee;

-- 创建用户表
create table users(
	id bigint primary key not null AUTO_INCREMENT,
	nickname varchar(32) not null,
	username varchar(32) not null,
	password varchar(32) not null,
	tel varchar(11) null,
	email varchar(32) null,
	create_date datetime not null,
	update_date datetime not null,
	del_flag smallint not null,
	key idx_create_date(create_date),
	key idx_update_date(update_date)
);


