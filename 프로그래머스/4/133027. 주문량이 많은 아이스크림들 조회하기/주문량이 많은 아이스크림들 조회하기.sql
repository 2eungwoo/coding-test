# 출하번호(SHIPMENT_ID)는 달라질수있으므로 FLAVOR를 조인키로 써야함
# 맛 별로 총주문량 더해야됨
select FH.FLAVOR
from FIRST_HALF FH, JULY J
where FH.FLAVOR = J.FLAVOR
group by FLAVOR
order by sum(FH.TOTAL_ORDER + J.TOTAL_ORDER) desc
limit 3;