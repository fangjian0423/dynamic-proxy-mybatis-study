CREATE TABLE USERS(
  ID INT PRIMARY KEY AUTO_INCREMENT,
  NAME VARCHAR(200),
  AGE INT,
  BIRTHDAY DATETIME
);

CREATE TABLE ROBOT(
  ID INT PRIMARY KEY AUTO_INCREMENT,
  NAME VARCHAR(200),
  AGE INT,
  STATUS INT
);