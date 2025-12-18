# ECOLI_DATA의 SIZE_OF_COLONY를 desc 했을 때

select
    E.ID,
    case percent
        when 1 then 'CRITICAL'
        when 2 then 'HIGH'
        when 3 then 'MEDIUM'
        else 'LOW'
    end
    as COLONY_NAME
from (
    select ID, ntile(4) over (order by SIZE_OF_COLONY desc) as percent
    from ECOLI_DATA
) as E 
order by E.ID asc;


# select 
#     E.ID, 
#     case
#         when E.percent <= 0.25 then 'CRITICAL'
#         when E.percent <= 0.5 then 'HIGH'
#         when E.percent <= 0.75 then 'MEDIUM'
#         else 'LOW'
#     end
#     as COLONY_NAME
# from (
#     select ID, percent_rank() over (order by SIZE_OF_COLONY desc) as percent
#     from ECOLI_DATA
# ) as E
# order by E.ID asc;


    

