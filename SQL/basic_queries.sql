-- Basic SELECT Query
SELECT * FROM customers;

-- SELECT with WHERE Clause
SELECT * FROM customers WHERE city = 'Tokyo';

-- INSERT INTO Query
INSERT INTO customers (name, city, country)
VALUES ('John Doe', 'New York', 'USA');

-- UPDATE Query
UPDATE customers
SET city = 'Osaka'
WHERE customer_id = 1;

-- DELETE Query
DELETE FROM customers
WHERE customer_id = 1;
