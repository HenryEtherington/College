--SitterAmendData.sql
UPDATE Clients
SET Surname = 'Fitzgerald-Townsend-Dodd'
WHERE Client_ID = 802;

UPDATE Sitters
SET email = 'ps1@gmail.com'
WHERE Sitter_ID = 101;

UPDATE Sitters
SET email = 'hflynn1@gmail.com'
WHERE Sitter_ID = 102;

UPDATE Sitters
SET email = 'kjones@gmail.com'
WHERE Sitter_ID = 103;

UPDATE Sitters
SET email = 'cw1@eircom.net.com'
WHERE Sitter_ID = 104;

UPDATE Sitters
SET email = 'bwilsonjones@.com'
WHERE Sitter_ID = 105;


INSERT INTO Bookings
VALUES(804,105,'23-JUN-2017','19:00',4.0,24.00,'25-JUN-17');

INSERT INTO PayGrades (Grade, Description)
VALUES('D','Executive');

COMMIT;
