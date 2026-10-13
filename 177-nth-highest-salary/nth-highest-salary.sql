CREATE OR REPLACE FUNCTION NthHighestSalary(N INT) RETURNS TABLE (Salary INT) AS $$
#variable_conflict use_column
BEGIN
    RETURN QUERY (
        With rankedhighest AS (
            select salary,
                   Dense_rank() over (Order by salary desc) AS rnk
            from employee
        )
        select max(salary)
        from rankedhighest
        where rnk = n
    );
END;
$$ LANGUAGE plpgsql;
