CREATE OR REPLACE FUNCTION NthHighestSalary(N INT) RETURNS TABLE (Salary INT) AS $$
BEGIN
  RETURN QUERY 
    -- Write your PostgreSQL query statement below.
        Select (
            select distinct e.salary
            from employee e
            order by salary desc
            OffSet greatest(0,N-1)
            limit 1
        ) as salary
        where N>=1;
END;
$$ LANGUAGE plpgsql;