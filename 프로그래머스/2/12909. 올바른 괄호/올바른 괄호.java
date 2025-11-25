// non-stack 버전
class Solution {
    boolean solution(String s) {

        int cnt = 0;
        for(Character c : s.toCharArray()) {
            if(c == '(') {
                cnt++;
            } else {
                cnt--;
            }
            if(cnt < 0) {
                return false;
            }
        }

        return cnt == 0;
    }
}

/*
    가장 최신의 상태만 추적하면 되므로
    스택 없이 상수값으로도 확인할 수 있다.

    만약 open이 들어오면 cnt + 1
    close가 들어오면 cnt - 1
    
    이렇게 해서 최종 순간에 cnt가 0이 되면 올바른 쌍만 들어왔다는 뜻

    근데 이 경우
    )( 같은 케이스는 cnt가 0이되는데
    )가 먼저 들어오는 순간에는 cnt<0 이 될 것이므로
    그냥 바로 false쳐버림
*/