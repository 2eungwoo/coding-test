class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
        
        # answer = []
        # sum = 0
        # for n in nums:
        #     sum += n
        #     answer.append(sum)

        # return answer

        prefix_sum = [0] * len(nums)
        prefix_sum[0] = nums[0]

        for i in range(1,len(nums)):
            prefix_sum[i] = prefix_sum[i-1] + nums[i]

        return prefix_sum