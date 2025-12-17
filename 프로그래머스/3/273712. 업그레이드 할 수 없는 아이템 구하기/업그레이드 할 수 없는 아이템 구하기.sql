# a->b는 업글 가능하다면
# a는 b의 부모임
# a가 업글 가능하다? => 자식이 있다
# a가 업글 불가능? => 자식이 없다
# a->b->c 가능할떄 c는 불가능

# 자식이 있다? 어떤 item_id를 가진 애가 parent_id에 있다
# 자식이 없다? 어떤 item_id를 가진 애가 parent_id에 없다 => select 대상
# 자식이 없다? (부모id를 가진 애의 아이템) 리스트에 없는 id를 가진 아이템
# parent_item_id가 null이 아닌(부모가있는) 리스트에 속하지 않는(not in)
# item_info.item_id not in (item where parent_item_id is not null)

select ITEM_ID, ITEM_NAME, RARITY
from ITEM_INFO
where ITEM_ID not in (
    select PARENT_ITEM_ID
    from ITEM_TREE
    where PARENT_ITEM_ID is not null
)
order by ITEM_ID desc;