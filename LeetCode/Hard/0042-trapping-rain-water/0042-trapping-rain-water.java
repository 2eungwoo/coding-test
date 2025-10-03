class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int lmax = height[left];
        int rmax = height[right];

        int waterSum = 0;
        while(left < right) {
            lmax = Math.max(height[left], lmax);
            rmax = Math.max(height[right], rmax);

            if(lmax <= rmax) { // lmax == rmax 상황에서도 그냥 물 높이만 구하면 되므로 그냥 범위에 포함시킴
                // waterSum += min(lmax, rmax) - height[i] 로 해도 되는데
                // lmax < rmax 면 min(lmax, rmax)는 lmax이므로 lmax - height[i]랑 똑같음
                waterSum += lmax - height[left];
                left++;
            } else {
                waterSum += rmax - height[right];
                right--;
            }
        }
        return waterSum;
    }
}

// 양쪽에 무조건 벽이 있어야 가운데 물이 찬다.
// 순차적으로 스캔한다고할때 현재 내가 보고있는 위치의 높이랑
// 양 옆 벽 중에서 작은쪽을 기준으로 차이만큼 물이 찬다
// -> water[i] = min(leftMax, rightMax) - height[i]
// waterSum += min(lmax, rmax) - height[i]

// 지금 내 위치 기준에서 lmax, rmax를 각각 찾아주려면
// 물 높이 한번 계산할때마다 n회 스캔 해야하므로 O(n^2)
// -> 이걸 투포인터로 lmax, rmax를 갱신하면서 물 높이를 누적해준다