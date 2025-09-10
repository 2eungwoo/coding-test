class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;

        while(left < right) {
            int row = right - left;
            int col = Math.min(height[left], height[right]);
            int water = row * col;
            max = Math.max(max, water);

            if(height[left] < height[right]) {
                left++;
            }else{
                right--;
            }
        }

        return max;
    }
}

// 물 넓이 = h * w 
// w == right - left

// h == 작은 막대 기준으로 물이 참
// -> left vs right 중 작은 곳 min(left,right)
// 작은쪽 기준으로 물 높이를 계산하니까
// 투포인터로 height[i] 이동하면서 작은쪽의 변경이 필요함
