--The Employee table holds all employees including their managers. Every employe
--e has an Id, and there is also a column for the manager Id. 
--
-- 
--+----+-------+--------+-----------+
--| Id | Name  | Salary | ManagerId |
--+----+-------+--------+-----------+
--| 1  | Joe   | 70000  | 3         |
--| 2  | Henry | 80000  | 4         |
--| 3  | Sam   | 60000  | NULL      |
--| 4  | Max   | 90000  | NULL      |
--+----+-------+--------+-----------+
-- 
--
-- Given the Employee table, write a SQL query that finds out employees who earn
-- more than their managers. For the above table, Joe is the only employee who ear
--ns more than his manager. 
--
-- 
--+----------+
--| Employee |
--+----------+
--| Joe      |
--+----------+
-- 
--


--There is no code of Java type for this problem


-- Runtime: 471 ms, faster than 50.33% of MySQL online submissions for Employees Earning More Than Their Managers.
-- Memory Usage: 0B, less than 100.00% of MySQL online submissions for Employees Earning More Than Their Managers.
SELECT e.Name AS Employee
FROM Employee e
LEFT JOIN Employee e1 ON e1.Id = e.ManagerId
WHERE
    e1.Salary < e.Salary