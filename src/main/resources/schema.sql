DROP TABLE IF EXISTS employee;

CREATE TABLE employee (
  id INTEGER AUTO_INCREMENT PRIMARY KEY,
  username VARCHAR(10),
  pending_count INTEGER ,
  claimed_count INTEGER 
);

CREATE SEQUENCE CLIENT_SEQUENCE_ID START WITH (select max(ID) + 1 from employee);