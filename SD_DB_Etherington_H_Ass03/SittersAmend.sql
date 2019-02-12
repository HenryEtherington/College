--Henry Etherington

-- SittersAmmend.sql

ALTER TABLE Clients;
MODIFY CONTENT SURNAME AS char (25);

ALTER TABLE  Sitters;
ADD CONTENT Email  char(30) NOT NULL;

ALTER TABLE  Sitters;
DROP CONTENT Phone;

ALTER TABLE  Sitters;
MODIFY CONTENT fk_SITTERS FOREIGN KEY (Grade) REFERENCES PayGrades; 

ALTER TABLE  Sitters;
MODIFY CONTENT  Grade CHECK (Grade="A" OR Grade="B" OR Grade="C");

