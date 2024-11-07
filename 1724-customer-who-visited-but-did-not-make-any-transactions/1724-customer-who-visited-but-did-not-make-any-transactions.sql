# Write your MySQL query statement below
select C.customer_id ,Count(customer_id) as count_no_trans from Visits C left join Transactions T
on C.visit_id=T.visit_id where transaction_id is null group by C.customer_id; 