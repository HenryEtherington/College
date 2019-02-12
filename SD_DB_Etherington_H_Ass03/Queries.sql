Queries.sql

SELECT *
FROM BOOKINGS,
GROUP BY (Booking_Date,client surname, forename, Sitter surname, forname, Pay),
ORDER BY booking date;

SELECT *
FROM SITTERS,
WHERE Sitters  = HighestPaid DEFAULT 0,
ORDER BY HighestPaid;

SELECT DESCRIPTION
FROM PAYGRADES,
ORDER BY Number of sitters;

SELECT (Sitter_ID,Surname,Forename)
FROM SITTERS.Bookings,
WHERE PAY = 0;