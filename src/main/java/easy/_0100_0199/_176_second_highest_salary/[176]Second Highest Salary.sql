--Write a SQL query to get the second highest salary from the Employee table. 
--
-- 
--+----+--------+
--| Id | Salary |
--+----+--------+
--| 1  | 100    |
--| 2  | 200    |
--| 3  | 300    |
--+----+--------+
-- 
--
-- For example, given the above Employee table, the query should return 200 as t
--he second highest salary. If there is no second highest salary, then the query s
--hould return null. 
--
-- 
--+---------------------+
--| SecondHighestSalary |
--+---------------------+
--| 200                 |
--+---------------------+
-- 
--


--There is no code of Java type for this problem

--Runtime: 199 ms, faster than 56.87% of MySQL online submissions for Second Highest Salary.
--Memory Usage: 0B, less than 100.00% of MySQL online submissions for Second Highest Salary.
SELECT
	MAX(Salary) AS SecondHighestSalary
FROM
	Employee
WHERE
	Salary < (
		SELECT
			MAX(Salary)
		FROM
			Employee
	)
LIMIT 0,
 1