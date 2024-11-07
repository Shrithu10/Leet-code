# Write your MySQL query statement below
select E.name from Employee E join Employee E1 on E1.managerId=E.id group by E.id having count(E1.id)>=5;