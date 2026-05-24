/* Write your PL/SQL query statement below */
-- select C.name as Customers
-- from Customers C left outer join Orders O
--     on C.id = O.customerId
-- where O.id is null


select C.name as Customers
from Customers C
where not exists (
    select 1
    from Orders O
    where O.customerId = C.id
)

