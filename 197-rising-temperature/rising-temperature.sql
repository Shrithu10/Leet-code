# Write your MySQL query statement below
select w1.id from Weather w join Weather w1 on w1.recordDate = DATE_ADD(w.recordDate, INTERVAL 1 DAY) where w1.temperature-w.temperature>0;