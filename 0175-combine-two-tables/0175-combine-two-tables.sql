/* Write your PL/SQL query statement below */
SELECT p1.FIRSTNAME, p1.LASTNAME, a1.CITY, a1.state
from person p1 left outer join address a1
on p1.personId = a1.personId;