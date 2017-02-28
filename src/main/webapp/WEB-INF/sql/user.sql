-- 创建数据库
create database suaee;

use suaee;

-- 创建用户表
create table users(
	id bigint primary key not null AUTO_INCREMENT,
	name varchar(30) not null,
	age int null,
	tel varchar(11) null,
	address varchar(100) null,
	create_time datetime not null,
	update_time datetime not null,
	status int not null,
	key idx_create_time(create_time),
	key idx_update_time(update_time)
)AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8;


