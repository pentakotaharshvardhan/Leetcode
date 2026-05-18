-- Write your PostgreSQL query statement below
select (
    select distinct salary 
    from Employee
    ORDER by salary DESC
    OffSet 1
    Limit 1
) as SecondHighestSalary;
