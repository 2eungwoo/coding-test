-- 코드를 작성해주세요
# SELECT COUNT(*) AS FISH_COUNT
# FROM FISH_INFO
# WHERE YEAR(TIME) = 2021











select count(ID) as FISH_COUNT
from FISH_INFO
where year(TIME) = 2021;