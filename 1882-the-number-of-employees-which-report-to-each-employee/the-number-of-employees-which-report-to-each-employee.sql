SELECT
    e.employee_id,
    e.name,
    COALESCE(COUNT(r.employee_id), 0) AS reports_count,
    ROUND(COALESCE(AVG(r.age), 0)) AS average_age
FROM
    Employees e
LEFT JOIN
    Employees r ON e.employee_id = r.reports_to
GROUP BY
    e.employee_id, e.name
HAVING
    COUNT(r.employee_id) > 0
ORDER BY employee_id ASC;
