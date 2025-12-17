-- 코드를 입력하세요
# 입양 간 기록은 있는데
# 보호소에 들어온 기록이 없는
# 동물ID, 이름 

# ANIMAL_OUTS 에서 DATETIME 이게 있는데
# ANIMAL_INS 에서 DATETIME 이게 없는
select O.ANIMAL_ID, O.NAME
from ANIMAL_OUTS O
    left join ANIMAL_INS I on O.ANIMAL_ID = I.ANIMAL_ID
where I.DATETIME is null
order by O.ANIMAL_ID asc;



# # ANIMAL_ID OUTS에는 있고 INS에는 없는
# select A.ANIMAL_ID, A.NAME
# from ANIMAL_OUTS A
# where A.ANIMAL_ID not in (
#     select ANIMAL_ID
#     from ANIMAL_INS
#     where ANIMAL_ID is not null
# )
# order by A.ANIMAL_ID asc;




