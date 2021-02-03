--The Employee table holds all employees. Every employee has an Id, a salary,
-- and there is also a column for the department Id.
--
-- 
--+----+-------+--------+--------------+
--| Id | Name  | Salary | DepartmentId |
--+----+-------+--------+--------------+
--| 1  | Joe   | 70000  | 1            |
--| 2  | Jim   | 90000  | 1            |
--| 3  | Henry | 80000  | 2            |
--| 4  | Sam   | 60000  | 2            |
--| 5  | Max   | 90000  | 1            |
--+----+-------+--------+--------------+
-- 
--
-- The Department table holds all departments of the company. 
--
-- 
--+----+----------+
--| Id | Name     |
--+----+----------+
--| 1  | IT       |
--| 2  | Sales    |
--+----+----------+
-- 
--
-- Write a SQL query to find employees who have the highest salary in each of the departments.
-- For the above tables, your SQL query should return the following rows
-- (order of rows does not matter).
--
-- 
--+------------+----------+--------+
--| Department | Employee | Salary |
--+------------+----------+--------+
--| IT         | Max      | 90000  |
--| IT         | Jim      | 90000  |
--| Sales      | Henry    | 80000  |
--+------------+----------+--------+
-- 
--
-- Explanation: 
--
-- Max and Jim both have the highest salary in the IT department and Henry has t
--he highest salary in the Sales department. 
-- 👍 579 👎 128


--There is no code of Java type for this problem

-- Runtime: 442 ms, faster than 99.71% of MySQL online submissions for Department Highest Salary.
-- Memory Usage: 0B, less than 100.00% of MySQL online submissions for Department Highest Salary.
SELECT d.name AS Department, t.name AS Employee, Salary
FROM (
         SELECT e.DepartmentId, e.name, Salary
         FROM Employee e
                  LEFT JOIN (SELECT MAX(Salary) AS maxSalary, DepartmentId
                             FROM Employee
                             GROUP BY DepartmentId) as t ON t.DepartmentId = e.DepartmentId
         WHERE e.Salary = t.maxSalary
     ) AS t
         LEFT JOIN Department d ON d.Id = t.DepartmentId
WHERE d.name IS NOT NULL