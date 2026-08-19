with satyam as(select d.name as Department, e.name as Employee ,e.salary as Salary,
dense_rank()  over(partition by d.name order by e.salary desc ) as r
from Employee as e join Department as d
on e.departmentId = d.id)
select Department ,Employee ,Salary from satyam
where r=1;