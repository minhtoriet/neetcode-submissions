-- Write your query below
select distinct c.customer_id, c.customer_name 
from customers c 
left join orders o1 on c.customer_id = o1.customer_id 
and o1.product_name = 'A'
join orders o2 on c.customer_id = o2.customer_id 
and o2.product_name = 'B'
left join orders o3 on c.customer_id = o3.customer_id
and o3.product_name = 'C'
where o1.product_name = 'A' and o3.product_name is null 
order by customer_name asc