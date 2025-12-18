# 입양을 못 간 동물 : INS에는 있는데 OUTS에는 없는
# 가장 오래 보호소에 있던 동물 세 마리 : ANIMAL_INS의 DATETIME asc order에서 limit 3
# 의 이름과 보호시작일(ANIMAL_INS의 DATETIME)

# order by 보호시작일 asc
select I.NAME, I.DATETIME
from ANIMAL_INS I
left join ANIMAL_OUTS O on I.ANIMAL_ID = O.ANIMAL_ID
where O.ANIMAL_ID is null
order by I.DATETIME asc
limit 3;