# Write your MySQL query statement below
SELECT Name AS customers
FROM customers
WHERE Id NOT IN (
    SELECT CustomerId
    FROM Orders
);