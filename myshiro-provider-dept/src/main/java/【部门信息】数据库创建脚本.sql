DROP DATABASE IF EXISTS my_dept;
CREATE DATABASE my_dept CHARACTER SET UTF8 ;
USE my_dept ;
CREATE TABLE dept (
	deptno     BIGINT ,
	dname  VARCHAR(200) ,
	CONSTRAINT pk_deptno PRIMARY KEY(deptno)
) ;
-- 编写测试数据
INSERT INTO dept(deptno,dname) VALUES (10,'开发部') ;
INSERT INTO dept(deptno,dname) VALUES (20,'财务部') ;
INSERT INTO dept(deptno,dname) VALUES (30,'市场部') ;