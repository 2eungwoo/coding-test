# 셋째 자리에서 반올림 -> 둘째자리까지 남김 -> round(avg(),2)
select round(
    avg(
        case
            when LENGTH is null then 10
            else LENGTH
        end
    ),2
) as AVERAGE_LENGTH
from FISH_INFO;

# 반올림 : ROUND
# 버림 : TRUNCATE
# 올림 : CEIL
# 내림 : FLOOR