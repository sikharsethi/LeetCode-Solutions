/* Write your PL/SQL query statement below */

select w1.id
from weather w1
JOIN weather w2
ON w1.recorddate - w2.recorddate = 1
where w1.temperature > w2.temperature;