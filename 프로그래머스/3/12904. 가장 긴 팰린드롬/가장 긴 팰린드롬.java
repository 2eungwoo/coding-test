import java.util.*;

class Solution {
    public int solution(String s) {   
        int n = s.length();
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            max = Math.max(max, expand(s, i));
            max = Math.max(max, expand(s, i, i + 1));
        }
        return max;
    }

    // 홀수 길이 팰린드롬 (중심 하나)
    private int expand(String s, int mid) {
        int left = mid;
        int right = mid;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1; // distance
    }

    // 짝수 길이 팰린드롬 (중심 두 개)
    private int expand(String s, int midLeft, int midRight) {
        int left = midLeft;
        int right = midRight;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1; // distance
    }
}


// 투포인터 말고도
// 가운데 기준으로 확장해나가는 방식으로 팰린드롬인지 확인한다 
// 왜냐면 투포인트 양 끝에서 조여가면서 비교하면 가장 긴 right-left 간격을 알아내기가 너무 까다로움
// 따라서 가운데에서 양옆으로 확장하면서 isPalindrome 체크가 통과하면 그떄의 right-left를 출력함

// 근데 확장할때 expand 함수를 만들건데
// s.length()가 짝수 일 경우에는?
// (i,i+1)을 넘겨서 두개를 기준으로 좌우 확장해야함
// expand(int mid) 랑 expand(int midLeft, int midRight)