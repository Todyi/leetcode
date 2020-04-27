--Given a Weather table, write a SQL query to find all dates' Ids with higher te
--mperature compared to its previous (yesterday's) dates. 
--
-- 
--+---------+------------------+------------------+
--| Id(INT) | RecordDate(DATE) | Temperature(INT) |
--+---------+------------------+------------------+
--|       1 |       2015-01-01 |               10 |
--|       2 |       2015-01-02 |               25 |
--|       3 |       2015-01-03 |               20 |
--|       4 |       2015-01-04 |               30 |
--+---------+------------------+------------------+
-- 
--
-- For example, return the following Ids for the above Weather table: 
--
-- 
--+----+
--| Id |
--+----+
--|  2 |
--|  4 |
--+----+
-- 
--

--There is no code of Java type for this problem

--Runtime: 425 ms, faster than 66.95% of MySQL online submissions for Rising Temperature.
--Memory Usage: 0B, less than 100.00% of MySQL online submissions for Rising Temperature.
SELECT
    w.Id
    FROM
    Weather AS w
    LEFT JOIN Weather AS we ON we.RecordDate = DATE_ADD(w.RecordDate, INTERVAL -1 DAY)
    WHERE
    we.Temperature < w.Temperature