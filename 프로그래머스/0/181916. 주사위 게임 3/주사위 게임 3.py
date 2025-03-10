def solution(a, b, c, d):
    nums = sorted([a,b,c,d])
    
    # 모두 같음 aaaa
    if(nums[0] == nums[3]):
        return 1111 * nums[0]
        
    # 하나만 다름
        # abbb
        # bbba    
    if(nums[1] == nums[3]):
        return (10 * nums[3] + nums[0])**2
    if(nums[0] == nums[2]):
        return (10 * nums[0] + nums[3])**2
        
    # 두개씩 같음
        # aabb
    if(nums[0] == nums[1] and nums[2] == nums[3]):
        return (nums[0] + nums[2]) * abs(nums[0] - nums[2])
        
    # 두개만 같음
        # aabc
    if(nums[0] == nums[1]):
        return nums[2] * nums[3]
        # bcaa
    if(nums[2] == nums[3]):
        return nums[0] * nums[1]
        # abbc
    if(nums[1] == nums[2]):
        return nums[0] * nums[3]
    
    # 다 다름 -> min : nums[0]
    return nums[0]
