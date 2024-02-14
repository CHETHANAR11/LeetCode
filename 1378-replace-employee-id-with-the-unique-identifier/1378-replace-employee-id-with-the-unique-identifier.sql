# Write your MySQL query statement belowemployeeuni
SELECT employeeuni.UNIQUE_ID, employees.name
FROM employees
LEFT JOIN employeeuni ON employees.id = employeeuni.id;

