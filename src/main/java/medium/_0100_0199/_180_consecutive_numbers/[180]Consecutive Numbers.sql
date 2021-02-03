--Table: Logs 
--
-- 
--+-------------+---------+
--| Column Name | Type    |
--+-------------+---------+
--| id          | int     |
--| num         | varchar |
--+-------------+---------+
--id is the primary key for this table.
-- 
--
-- 
--
-- Write an SQL query to find all numbers that appear at least three times consecutively.
--
-- Return the result table in any order. 
--
-- The query result format is in the following example: 
--
-- 
--
-- 
--Logs table:
--+----+-----+
--| Id | Num |
--+----+-----+
--| 1  | 1   |
--| 2  | 1   |
--| 3  | 1   |
--| 4  | 2   |
--| 5  | 1   |
--| 6  | 2   |
--| 7  | 2   |
--+----+-----+
--
--Result table:
--+-----------------+
--| ConsecutiveNums |
--+-----------------+
--| 1               |
--+-----------------+
--1 is the only number that appears consecutively for at least three times.
-- 
-- 👍 550 👎 127


--There is no code of Java type for this problem

-- Runtime: 360 ms, faster than 97.86% of MySQL online submissions for Consecutive Numbers.
-- Memory Usage: 0B, less than 100.00% of MySQL online submissions for Consecutive Numbers.
SELECT DISTINCT Num as ConsecutiveNums
FROM(
   SELECT
       lead(Num) OVER () AS leadNum,
       Num,
       lag(Num) OVER () AS lagNum
   FROM Logs
) AS t WHERE t.Num = t.leadNum AND t.Num = t.lagNum;

-- Runtime: 369 ms, faster than 95.14% of MySQL online submissions for Consecutive Numbers.
-- Memory Usage: 0B, less than 100.00% of MySQL online submissions for Consecutive Numbers.
SELECT DISTINCT
    l1.Num AS ConsecutiveNums
FROM
    Logs l1,
    Logs l2,
    Logs l3
WHERE
    l1.Id = l2.Id - 1
  AND l2.Id = l3.Id - 1
  AND l1.Num = l2.Num
  AND l2.Num = l3.Num
;