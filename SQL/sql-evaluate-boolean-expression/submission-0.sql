-- Write your query below

select e.left_operand, e.operator, e.right_operand, 
case 
    when operator = '>' and l.value > r.value then 'true'
    when operator = '=' and l.value = r.value then 'true'
    when operator = '<' and l.value < r.value then 'true'
    else 'false'
end as value
from expressions e join variables l on e.left_operand = l.name
                join variables r on e.right_operand = r.name