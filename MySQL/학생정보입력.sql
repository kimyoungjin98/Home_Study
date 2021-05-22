-- stUser 접속

USE StudentInfo;

CREATE TABLE tbl_student(
st_seq	BIGINT		AUTO_INCREMENT PRIMARY KEY,
st_name	VARCHAR(20)	NOT NULL	,
st_grade	INT	NOT NULL	,
st_tel	VARCHAR(20)	NOT NULL,	
st_addr	VARCHAR(125)	NOT NULL	,
st_dept	VARCHAR(125)	NOT NULL	

);

INSERT INTO tbl_student (st_name, st_grade, st_tel, st_addr, st_dept)
VALUES ( '김영진', '3' , '010-1234-4321', '북문대로 222-11', '컴퓨터공학과');

SELECT * FROM tbl_student;