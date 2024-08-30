class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        dic = collections.Counter(nums)
    
        # 빈도수 많은 순서대로 정렬
        sorted_items = sorted(dic.items(), key=lambda x: x[1], reverse=True)
        #print(sorted_items)
        # 상위 k개만 뽑기
        res = []
        for i in range(k):
            res.append(sorted_items[i][0])
        
        return res
