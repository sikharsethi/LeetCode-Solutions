-- Write your PostgreSQL query statement below

Select (
    select distinct salary from 
    employee order by salary desc
    limit 1 offset 1
) AS SecondHighestSalary;