-- CREATE TABLE Query
CREATE TABLE customers (
    customer_id INT PRIMARY KEY,
    name VARCHAR(100),
    city VARCHAR(50),
    country VARCHAR(50)
);

-- ALTER TABLE to Add a Column
ALTER TABLE customers
ADD phone_number VARCHAR(15);

-- ALTER TABLE to Modify a Column
ALTER TABLE customers
MODIFY phone_number VARCHAR(20);

-- DROP TABLE
DROP TABLE customers;
