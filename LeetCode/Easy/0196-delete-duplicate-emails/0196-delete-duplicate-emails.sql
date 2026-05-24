/* Write your PL/SQL query statement below */

-- delete from Person P1
-- where exists (
--     select 1
--     from Person P2
--     where P1.email = P2.email
--         and P1.id > P2.id
-- )


delete from Person
where id in (
    select P1.id
    from Person P1 join Person P2
        on P1.email = P2.email
        and P1.id > P2.id
)
