/* Write your PL/SQL query statement below */

with Rankedsalary AS(
    SELECT
    d.name AS Department,
    e.name AS Employee,
    e.salary AS Salary,
    DENSE_RANK() OVER (PARTITION BY e.departmentId order by e.salary DESC) AS salary_rank
    from employee e
    JOIN Department d ON e.departmentId = d.id
    )
SELECT Department,
Employee,
Salary
FROM Rankedsalary
WHERE salary_rank <= 3;