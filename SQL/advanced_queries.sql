-- INNER JOIN Example
SELECT orders.order_id, customers.name, customers.city
FROM orders
JOIN customers
ON orders.customer_id = customers.customer_id;

-- LEFT JOIN Example
SELECT customers.name, orders.order_date
FROM customers
LEFT JOIN orders
ON customers.customer_id = orders.customer_id;

-- GROUP BY with HAVING
SELECT city, COUNT(*) AS customer_count
FROM customers
GROUP BY city
HAVING COUNT(*) > 1;

-- ORDER BY Example
SELECT * FROM customers
ORDER BY name ASC;

-- LIMIT Example
SELECT * FROM customers
LIMIT 5;
