--Write a SQL query to get the nth highest salary from the Employee table. 
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
-- For example, given the above Employee table, the nth highest salary where n =
-- 2 is 200. If there is no nth highest salary, then the query should return null.
-- 
--
-- 
--+------------------------+
--| getNthHighestSalary(2) |
--+------------------------+
--| 200                    |
--+------------------------+
-- 
-- 👍 550 👎 432


--There is no code of Java type for this problem

-- Runtime: 252 ms, faster than 98.80% of MySQL online submissions for Nth Highest Salary.
-- Memory Usage: 0B, less than 100.00% of MySQL online submissions for Nth Highest Salary.
CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
set N=N-1;
RETURN (
    # Write your MySQL query statement below.
  select distinct salary
      from employee
      order by salary desc
      limit 1 offset N
    );
END