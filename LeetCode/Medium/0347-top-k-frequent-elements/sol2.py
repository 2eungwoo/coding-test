class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        
        dic = collections.Counter(nums)
        # most_common(k) => [(1, 3), (2, 2)]
        most_common_items = dic.most_common(k)
        result = []
        for item in most_common_items:
            key = item[0]
            result.append(key)
        
        return result

