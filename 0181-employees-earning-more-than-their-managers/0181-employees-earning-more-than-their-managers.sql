# Write your MySQL query statement below
SELECT e1.name AS Employee
FROM Employee e1
,Employee e2
where e1.managerId = e2.id
and e1.salary > e2.salary;
