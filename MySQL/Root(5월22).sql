-- 학생정보입력을 위한 query

CREATE USER stUser@localhost identified by '1234'; 

GRANT all privileges on *.* TO stUser@localhost;

DROP USER stUser@localhost;