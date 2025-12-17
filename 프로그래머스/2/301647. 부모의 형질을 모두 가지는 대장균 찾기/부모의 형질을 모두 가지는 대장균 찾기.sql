# 자신의 개체형질(GENOTYPE)이 부모의 GENOTYPE과 일치하면서 
# 부모의 id를 다 가지고 있는 애를 select해야함
#  ㄴ 자신.id IN 부모.id
select C.ID, C.GENOTYPE, P.GENOTYPE as PARENT_GENOTYPE
from ECOLI_DATA C, ECOLI_DATA P
where C.PARENT_ID = P.ID
    and (C.GENOTYPE & P.GENOTYPE) = P.GENOTYPE
order by C.ID asc;

# select C.ID, C.GENOTYPE, P.GENOTYPE as PARENT_GENOTYPE
# from ECOLI_DATA C join ECOLI_DATA P on C.PARENT_ID = P.ID
# where (P.GENOTYPE & C.GENOTYPE) = P.GENOTYPE
# order by C.ID asc;