# Write your MySQL query statement below
SELECT
    e.employee_id,
    e.department_id
FROM 
    Employee e
WHERE 
    primary_flag = 'Y'
OR
    e.employee_id in 
    (select employee_id from Employee group by employee_id having count(distinct department_id)=1);