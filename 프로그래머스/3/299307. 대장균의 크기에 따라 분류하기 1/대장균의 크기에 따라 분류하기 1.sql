# SIZE_OF_COLONY <= 100 이면 LOW
# SIZE_OF_COLONY > 100 && SIZE_OF_COLONY <= 1000 이면 MEDIUM
# SIZE_OF_COLONY > 100 이면 HIGH

select ID,
case
    when SIZE_OF_COLONY <= 100 then 'LOW'
    when SIZE_OF_COLONY > 100 and SIZE_OF_COLONY <= 1000 then 'MEDIUM'
    else 'HIGH'
end as size
from ECOLI_DATA
order by ID asc;

# if(조건,참일때값,거짓일떄값)
# select ID,
# if(SIZE_OF_COLONY <= 100, 'LOW', if(SIZE_OF_COLONY <= 1000, 'MEDIUM', 'HIGH')) as SIZE
# from ECOLI_DATA
# order by ID asc;
