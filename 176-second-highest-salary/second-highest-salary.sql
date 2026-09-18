/* Write your PL/SQL query statement below */

select max(salary) AS SecondHighestSalary from employee 
where salary < (select max(salary) from employee);