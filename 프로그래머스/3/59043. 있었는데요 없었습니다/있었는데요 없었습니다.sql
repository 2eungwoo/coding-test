# ANIMAL_INS의 DATETIME : 보호 시작일
# ANIMAL_OUTS의 DATETIME : 입양일

# 보호 시작일보다 입양일이 더 빠른 동물 아이디와 이름
# order by 보호 시작일 asc

select I.ANIMAL_ID, I.NAME
from ANIMAL_INS I join ANIMAL_OUTS O on I.ANIMAL_ID = O.ANIMAL_ID
where I.DATETIME > O.DATETIME
order by I.DATETIME asc;