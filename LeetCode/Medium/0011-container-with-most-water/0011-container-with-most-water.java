class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int water = 0;
        int max = Integer.MIN_VALUE;

        while(left < right) {
            int w = right - left;
            int h = Math.min(height[left], height[right]);
            water = w * h;
            max = Math.max(water, max);

            if(height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return max;
    }
   
}


// 물 높이를 구한다. 가로 x 세로
// 가로는 right - left
// 세로는 height[i]

// height[i]가 관건인데, 이게 두개가 있어야되고 (height[left], height[right]) 중에서 길이가 작은 쪽
// 기준으로 물이 찬다.
// 그래서 작은쪽에 변화를 주면서(two-pointer) water volume을 게속 갱신/비교 한다음
// 비교 다 마치면 그떄의 max변수에 있는 값을 리턴