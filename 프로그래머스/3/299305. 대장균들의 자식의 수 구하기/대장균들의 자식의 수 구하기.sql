# select ID, COUNT(*) as CHILD_COUNT
# from ECOLI_DATA 
# where PARENT_ID is not null

select P.ID, count(C.ID) as CHILD_COUNT
from ECOLI_DATA P left join ECOLI_DATA C
    on P.ID = C.PARENT_ID
group by P.ID
order by P.ID asc