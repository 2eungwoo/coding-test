class Solution:
    def trap(self, height: List[int]) -> int:
        # equation : min(lmax,rmax) - height[i] (i:cur idx)
        # idea : need to know left-side, right-side => two pointer
        
        left, right = 0, len(height) - 1
        lmax, rmax = height[left], height[right]
        water = 0
        
        while(left < right):
            lmax, rmax = max(height[left], lmax), max(height[right], rmax)

            if(lmax <= rmax): 
                # lmax < rmax 면 min(lmax,rmax)는 lmax이므로 lmax - height[i]랑 같음
                # water += min(lmax,rmax) - height[left]
                water += lmax - height[left]
                left += 1
            else:
                # water += min(lmax,rmax) - height[right]
                water += rmax - height[right]
                right -= 1

        return water

        