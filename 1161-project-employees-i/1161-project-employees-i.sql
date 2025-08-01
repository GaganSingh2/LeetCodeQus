/* Write your PL/SQL query statement below */
SELECT project_id  , ROUND(AVG(experience_years),2) average_years  
FROM PROJECT P,EMPLOYEE E
WHERE P.EMPLOYEE_ID=E.EMPLOYEE_ID
GROUP BY PROJECT_ID
-- HAVING AVG(experience_years )
ORDER BY project_id ;