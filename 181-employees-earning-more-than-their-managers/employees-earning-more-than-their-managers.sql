

WITH Employers (id, salary) AS (
    SELECT id, salary
    FROM Employee
)
SELECT e.name AS Employee
FROM Employee e
JOIN Employers m
  ON e.managerId = m.id
WHERE e.salary > m.salary;
