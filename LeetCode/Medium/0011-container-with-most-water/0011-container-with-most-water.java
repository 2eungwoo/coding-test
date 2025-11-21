class Solution {
    public int maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;

        int water = 0;
        int w = 0;
        int h = 0;
        int max = Integer.MIN_VALUE;
        while(left < right) {
            int LHeight = height[left];
            int RHeight = height[right];
            w = right - left;
            h = Math.min(LHeight, RHeight);
            water = w * h;
            max = Math.max(water, max);

            if(LHeight < RHeight) {
                left++;
            } else {
                right--;
            }
        }

        return max;
    }
}

/*
    물의 높이 구하려면
    양 쪽의 기둥을 보고 그 중 작은쪽을 기준으로 height가 돼서 물이 찬다
    width는 두 막대간의 idx차이
    
    w = height[right] - height[left]
    h = Math.min(height[left], height[right])
    water = w * h

    하나하나 다 찾아줄 수 없으니 투포인터로 n스캔만에 찾아줄거임
    
    height[left] < height[right] 면, 물 구해준다음에
    다음걸로 비교 이어나가야하므로 작은쪽인 left를 이동(++)
    반대면 right--
*/