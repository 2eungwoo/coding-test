# root인거 찾는거니까 parent.id is null인거 출력
select II.ITEM_ID, II.ITEM_NAME
from ITEM_INFO II, ITEM_TREE IT
where IT.ITEM_ID = II.ITEM_ID
    and IT.PARENT_ITEM_ID is null
order by II.ITEM_ID asc;
