class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        for (int num : nums) {
            // 후보가 아직 없으면 현재 숫자를 후보로 지정
            if (count == 0) {
                candidate = num;
                count = 1;
            }
            // 현재 숫자가 후보와 같으면 카운트 증가
            else if (num == candidate) {
                count++;
            }
            // 현재 숫자가 후보와 다르면 카운트 감소
            else {
                count--;
            }
        }

        // 3. 문제 조건상 majority element는 반드시 존재하므로
        // 마지막에 남은 candidate가 정답
        return candidate;
    }
}

// O(nlogn)
// class Solution {
//     public int majorityElement(int[] nums) {
//         Arrays.sort(nums);
//         return nums[nums.length/2]; // 정렬해서 중앙값을인덱스로 해서 값찾으면 걔는 무조건 해당 인덱스에 담겨져있음
//     }
// }

// 시간 복잡도 O(n), 공간 복잡도 O(n)
// class Solution {
//     public int majorityElement(int[] nums) {
//         Map<Integer, Integer> map = new HashMap<>();
//         int len = nums.length;
//         int half = len/2;

//         for(int n: nums) {
//             map.put(n, map.getOrDefault(n,0) + 1);
//             if(map.get(n) > half) return n;
//         }
//         return -1;
        
//     }
// }

// n <= 50000
// n^2 = 2500000000