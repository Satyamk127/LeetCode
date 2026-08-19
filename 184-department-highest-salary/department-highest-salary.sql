select Department, Employee, Salary from (select d.name as Department,e.name as Employee ,e.salary as Salary ,
rank() over(partition by d.name order by e.salary desc) as salary_rank
from employee as e 
join Department as d on e.departmentId=d.id
) r
where salary_rank=1;