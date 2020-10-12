--Table: Person
--
--
--+-------------+---------+
--| Column Name | Type    |
--+-------------+---------+
--| PersonId    | int     |
--| FirstName   | varchar |
--| LastName    | varchar |
--+-------------+---------+
--PersonId is the primary key column for this table.
--
--
-- Table: Address
--
--
--+-------------+---------+
--| Column Name | Type    |
--+-------------+---------+
--| AddressId   | int     |
--| PersonId    | int     |
--| City        | varchar |
--| State       | varchar |
--+-------------+---------+
--AddressId is the primary key column for this table.
--
--
--
--
-- Write a SQL query for a report that provides the following information for ea
--ch person in the Person table, regardless if there is an address for each of tho
--se people:
--
--
--FirstName, LastName, City, State
--
--


--There is no code of Java type for this problem

SELECT
  FirstName,
  LastName,
  City,
  State
FROM Person p
LEFT JOIN Address a ON a.PersonId = p.PersonId