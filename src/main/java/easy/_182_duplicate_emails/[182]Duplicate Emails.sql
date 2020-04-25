--Write a SQL query to find all duplicate emails in a table named Person. 
--
-- 
--+----+---------+
--| Id | Email   |
--+----+---------+
--| 1  | a@b.com |
--| 2  | c@d.com |
--| 3  | a@b.com |
--+----+---------+
-- 
--
-- For example, your query should return the following for the above table: 
--
-- 
--+---------+
--| Email   |
--+---------+
--| a@b.com |
--+---------+
-- 
--
-- Note: All emails are in lowercase. 
--


--There is no code of Java type for this problem

-- Runtime: 306 ms, faster than 45.72% of MySQL online submissions for Duplicate Emails.
-- Memory Usage: 0B, less than 100.00% of MySQL online submissions for Duplicate Emails.
SELECT
	Email
FROM
	(
		SELECT
			COUNT(*) AS C,
			Email
		FROM
			Person
		GROUP BY
			Email
	) p
WHERE
	c > 1