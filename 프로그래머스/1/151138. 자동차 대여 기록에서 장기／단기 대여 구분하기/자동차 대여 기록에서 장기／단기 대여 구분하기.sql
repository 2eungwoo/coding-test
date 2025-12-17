-- 코드를 입력하세요
select 
    HISTORY_ID, 
    CAR_ID, 
    DATE_FORMAT(START_DATE, '%Y-%m-%d') as START_DATE, 
    DATE_FORMAT(END_DATE, '%Y-%m-%d') as END_DATE, 
    case 
        when datediff(END_DATE, START_DATE) + 1 >= 30 then '장기 대여'
        else '단기 대여'
    end
    as RENT_TYPE
from CAR_RENTAL_COMPANY_RENTAL_HISTORY
where START_DATE between '2022-09-01' and '2022-09-30'
order by HISTORY_ID desc;

# end_date - start_date 할때 만약에 09/01 - 09/01 하면 0나오는데
# 사실상 하루 빌린거라 +1 해줘야함

# date_format에서 대/소 다르니까 구분 확실히..