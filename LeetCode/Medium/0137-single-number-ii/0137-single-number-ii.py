class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        
        if(len(nums) == 1):
            return nums[0]

        dic = collections.defaultdict(int)

        for n in nums:
            dic[n] += 1

        for k,v in dic.items():
            if(v == 1):
                return k