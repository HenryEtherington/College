--Henry Etherington
--Sitters.sql

--Schema HomeCare

CREATE TABLE PayGrades
(Grade char(1),
DESCRIPTION char(20) NOT NULL,
Hourly_Rate numeric (3,2),
CONSTRAINT pk_PayGrades PRIMARY KEY (Grade));

CREATE TABLE Sitters
(Sitter_ID numeric(3),
Surname char(20) NOT NULL,
Forename char(15) NOT NULL,
PPSN char (8),
Phone char (10),
Grade char (1),
--Email char (30),
CONSTRAINT pk_Sitters PRIMARY KEY (Sitter_ID));

CREATE TABLE Clients
(Client_ID numeric(3),
Surname char (20) NOT NULL,
Forename char (15) NOT NULL,
Street char (20) NOT NULL,
Town char(20) NOT NULL,
County char (15) NOT NULL,
CONSTRAINT pk_Clients PRIMARY KEY (Client_ID));

CREATE TABLE Bookings
(Client_ID numeric(3),
Sitter_ID numeric (3),
Booking_Date DATE,
Start_Time char(5),
Hours numeric(4,2),
Pay numeric(6,2),
PayDate Date,
CONSTRAINT pk_Bookings PRIMARY KEY (Client_ID,Sitter_Id,Booking_Date),
CONSTRAINT fk_BOOKINGS_Clients FOREIGN KEY (Client_ID) REFERENCES Clients,
CONSTRAINT fk_BOOKINGS_Sitters FOREIGN KEY (Sitter_ID) REFERENCES Sitters);

