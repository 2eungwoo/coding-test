import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int n = citations.length;
        Arrays.sort(citations);
        
        int answer = 0;
    
        // h를 0부터 n까지 증가시키며 검사
        for (int h = 0; h <= n; h++) {
            int more = 0; 
            for (int c : citations) {
                if (c >= h) more++;
            }

            if (more >= h) {
                answer = h; 
            }
        }

        return answer;
        
    }
}

// n ==> citations.length
// 1 <= n <= 1000
// key : [3, 0, 6, 1, 5] 여기서 3이라는 숫자가 어떻게 도출되었나?

// h를 1부터 최대10000까지 반복하면서 세면..
// O(N*H) ==> 10000000
// 무식하게 다 찾는거보다는 음 투포인터? 
// 중앙값을 찾는건가?
// 정렬하면 0 1 3 5 6

// 만약 중복값이있다면?
// 3 3 6 1 0 5
// 정렬 -> 0 1 3 3 5 6
// 정렬하고 h를 0부터 세야하나? h회 이상x, 이하y 다 세다가 x==y인 지점이 h?

// 0 4 6 7 8 9 6 5 4 2 3 5 6 8.  n = 14
// 0 2 3 4 4 5 5 6 6 6 7 8 8 9 
// h=0, x=14, y=1
// h=2, x=13, y=2
// h=3, x=12
// h=4, x=11
// h=5, x=9,
// h=6, x=7, y=7, .x==y
