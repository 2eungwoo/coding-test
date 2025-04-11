class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        
        # idx = 1

        # for i in range(1,len(nums)):
        #     if(nums[i-1] == nums[i]):
        #         continue
        #     nums[idx] = nums[i]
        #     idx += 1
        
        # return idx

        left, right = 0, 1
        
        while(right < len(nums)):
            if(nums[left] == nums[right]):
                right += 1
            elif(nums[left] != nums[right]):
                left += 1
                nums[left] = nums[right]

        return left+1