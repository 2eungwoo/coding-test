-- 코드를 작성해주세요
# select CONCAT(FORMAT(max(LENGTH), 2), 'cm') as MAX_LENGTH
# from FISH_INFO;

select concat(max(LENGTH), 'cm') as MAX_LENGTH
from FISH_INFO;
