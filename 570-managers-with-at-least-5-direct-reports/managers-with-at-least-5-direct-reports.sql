# Write your MySQL query statement below
select e.name from Employee as e 
join 
Employee as d 
on 
e.id=d.managerId
group by d.managerId
having count(*)>=5;
