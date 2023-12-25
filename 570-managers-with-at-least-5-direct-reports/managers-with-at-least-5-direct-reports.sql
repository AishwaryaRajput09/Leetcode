# Write your MySQL query statement below
select name from Employee e
join (
    select managerId
    from Employee
    group by managerId
    having count(managerId) >= 5

) as managers
on e.id = managers.managerId;

