/* Write your PL/SQL query statement below */
select C.name as Customers
from Customers C left outer join Orders O
    on C.id = O.customerId
where O.id is null