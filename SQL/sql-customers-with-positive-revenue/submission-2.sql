-- Write your query below
select distinct customer_id from customers where customers.year = 2020 group by customers.customer_id, customers.year having sum(revenue) > 0;