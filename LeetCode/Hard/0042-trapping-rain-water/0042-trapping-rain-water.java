class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int leftMax = height[left];
        int rightMax = height[right];

        int water = 0;
        while(left < right) {
            leftMax = Math.max(leftMax, height[left]);
            rightMax = Math.max(rightMax, height[right]);

            if(leftMax < rightMax) {
                water += (leftMax - height[left]);
                left++;
            }
            else {
                water += (rightMax - height[right]);
                right--;
            }
        }

        return water;
    }
}

/*
    좌/우 기둥 높이에서 짧은 쪽 기준으로 물이 참
    짧은 쪽 기준으로 차는데 현재에 벽이 있을 수 있으므로 현재 높이를 또 뺴주면 됨
    
    기둥 중에서 젤 높은애가 있으면 걔를 기준으로 계속 비교가 될거임 
    lmax, rmax 계속 비교 하는데
    같으면 어느쪽을 땡겨도 상관없음

    minHeight = min(lmax, rmax)
    water[i] = minHeight(lmax or rmax) - curHeight[i]
    
    만약 lmax < rmax 면 minHeight는 lmax이므로 결국
    if(lmax < rmax) {
        water[i] = lmax - height[i]
        left++;
    } else {
        water[i] = rmax - height[i]
        right--;
    }

    
*/