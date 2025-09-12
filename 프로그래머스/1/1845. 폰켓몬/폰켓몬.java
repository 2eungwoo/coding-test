import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {

        // 중복해서 가져가지 않는다.
        HashSet<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }

        // 최대 nums.length/2 마리 가져갈 수 있다.
        int half = nums.length / 2;

        int max = set.size();

        // 중복 제외하고 가져갈 수 있는 최대 개수는 set.size()
        // 단, 여기서 가져갈 수 있는 수는 half를 넘을 수 없음
        if (max >= half) {
            return half;
        } else {
            return max;
        }
    }
}