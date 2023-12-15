WITH RankedSalaries AS (
    SELECT
        e.id AS employee_id,
        e.name AS employee_name,
        e.salary,
        d.name AS department_name,
        DENSE_RANK() OVER (PARTITION BY e.departmentId ORDER BY e.salary DESC) AS salary_rank
    FROM
        Employee e
    JOIN
        Department d ON e.departmentId = d.id
)
SELECT
    department_name AS Department,
    employee_name AS Employee,
    salary
FROM
    RankedSalaries
WHERE
    salary_rank <= 3;
