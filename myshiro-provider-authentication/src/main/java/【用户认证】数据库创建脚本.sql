DROP DATABASE IF EXISTS my_authentication;
CREATE DATABASE my_authentication CHARACTER SET UTF8 ;
USE my_authentication ;
CREATE TABLE member(
   mid                  varchar(50) not null,
   name                 varchar(30),
   password             varchar(32),
   locked               int,
   CONSTRAINT pk_mid PRIMARY KEY (mid)
) engine='innodb';
-- 0表示活跃、1表示锁定
-- 用户名：admin / hello  密码需要修改
INSERT INTO member(mid,name,password,locked) VALUES ('admin','管理员','46BCE1E57D328771F6FC3BB017A00B26',0) ;
-- 用户名：origin / java
INSERT INTO member(mid,name,password,locked) VALUES ('origin','普通人','12B602C6E905D30031FDD5F5AAD8C155',0) ;
-- 用户名：mermaid / hello
INSERT INTO member(mid,name,password,locked) VALUES ('mermaid','美人鱼','46BCE1E57D328771F6FC3BB017A00B26',1) ;
