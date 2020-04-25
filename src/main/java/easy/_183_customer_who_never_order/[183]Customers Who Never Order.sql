--Suppose that a website contains two tables, the Customers table and the Orders
-- table. Write a SQL query to find all customers who never order anything. 
--
-- Table: Customers. 
--
-- 
--+----+-------+
--| Id | Name  |
--+----+-------+
--| 1  | Joe   |
--| 2  | Henry |
--| 3  | Sam   |
--| 4  | Max   |
--+----+-------+
-- 
--
-- Table: Orders. 
--
-- 
--+----+------------+
--| Id | CustomerId |
--+----+------------+
--| 1  | 3          |
--| 2  | 1          |
--+----+------------+
-- 
--
-- Using the above tables as example, return the following: 
--
-- 
--+-----------+
--| Customers |
--+-----------+
--| Henry     |
--| Max       |
--+-----------+
-- 
--


--There is no code of Java type for this problem

-- Runtime: 455 ms, faster than 36.25% of MySQL online submissions for Customers Who Never Order.
-- Memory Usage: 0B, less than 100.00% of MySQL online submissions for Customers Who Never Order.
SELECT
	Name AS Customers
FROM
	Customers AS c
WHERE
	NOT EXISTS (
		SELECT
			CustomerId
		FROM
			Orders AS o
		WHERE
			o.CustomerId = c.Id
	)