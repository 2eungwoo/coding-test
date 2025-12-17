# -- 코드를 작성해주세요
# SELECT YEAR(YM) AS YEAR, ROUND(AVG(PM_VAL1),2) AS 'PM10', ROUND(AVG(PM_VAL2),2) AS 'PM2.5'
# FROM AIR_POLLUTION
# GROUP BY YEAR,LOCATION2
# HAVING LOCATION2 = '수원'
# ORDER BY YEAR ASC








select 
    year(YM) as YEAR, 
    round(avg(PM_VAL1),2) as 'PM10', 
    round(avg(PM_VAL2),2) as 'PM2.5'
from AIR_POLLUTION
group by YEAR, LOCATION2
having LOCATION2 = '수원'
order by year(YM) asc;


