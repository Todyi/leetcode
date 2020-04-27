--Write a SQL query to delete all duplicate email entries in a table named Perso
--n, keeping only unique emails based on its smallest Id. 
--
-- 
--+----+------------------+
--| Id | Email            |
--+----+------------------+
--| 1  | john@example.com |
--| 2  | bob@example.com  |
--| 3  | john@example.com |
--+----+------------------+
--Id is the primary key column for this table.
-- 
--
-- For example, after running your query, the above Person table should have the
-- following rows: 
--
-- 
--+----+------------------+
--| Id | Email            |
--+----+------------------+
--| 1  | john@example.com |
--| 2  | bob@example.com  |
--+----+------------------+
-- 
--
-- Note: 
--
-- Your output is the whole Person table after executing your sql. Use delete st
--atement. 
--


--There is no code of Java type for this problem

-- Runtime: 544 ms, faster than 98.30% of MySQL online submissions for Delete Duplicate Emails.
-- Memory Usage: 0B, less than 100.00% of MySQL online submissions for Delete Duplicate Emails.
DELETE
FROM
	Person
WHERE
	Id NOT IN (
		SELECT
			Id
		FROM
			(
				SELECT
					MIN(Id) AS Id
				FROM
					Person P1
				GROUP BY
					P1.Email
				HAVING
					count(P1.Id) > 0
			) AS t
	)