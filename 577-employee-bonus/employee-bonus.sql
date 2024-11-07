# Write your MySQL query statement below
select E.name ,B.bonus from Employee E Left join Bonus B on B.empId=E.empId where B.bonus<1000 or B.bonus is null; 