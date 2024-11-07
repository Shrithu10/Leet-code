# Write your MySQL query statement below
select EI.unique_id,E.name  from Employees E left join EmployeeUNI EI on E.id=EI.id;