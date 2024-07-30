class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums.sort()
        sum = 0

         # [1,2,3,4,5,6] 
         # min(1,2) + min(3,4) + min(5,6)
         # 1 + 3 + 5
        for i,n in enumerate(nums):
            if(i%2 == 0):
                sum += n

        return sum

