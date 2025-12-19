import java.util.Stack;

class Solution {
    
    int cnt = 0;

    public int solution(int[] numbers, int target) {
        
        Stack<State> stack = new Stack<>();
        
        dfs(new State(0,0), numbers, target);

        return cnt;              
    }

    private void dfs(State cur, int[] numbers, int target) {
        // 현재 값 
        if(cur.idx == numbers.length) {
            if(cur.acc == target) {
                cnt++;
            }
            return;
        }

        // 다음 값 
        dfs(new State(cur.acc + numbers[cur.idx], cur.idx + 1), numbers, target);
        dfs(new State(cur.acc - numbers[cur.idx], cur.idx + 1), numbers, target);
    }

    private class State {
        private final int acc;
        private final int idx;

        public State(int acc, int idx) {
            this.acc = acc;
            this.idx = idx;
        }
    }
}
/*
    주어진 배열 요소를 탐색하면서 +냐 -냐를 분기해가면서 완전탐색 
    숫자개수가 최대 20개니까 
    모든 탐색 경우의 수는 2^20임
    2^10은 1024고 1024 * 1024는 대충 1000만 이니까 완전탐색 가능 
ㅑ
    완전탐색으로 합값 계속 추적하면서 모든 숫자를 다 사용했을 때 target이 같으면 cnt++
    탐색 종료 조건은 추적idx가 arr.length 에 도달하면 끝 
    cur.idx == numbers.length 인 조건에서 (요소 다 쓴 시점) target이랑 같은지 봐야됨 
    그 전에 같은건 소용없음 문제에서 요구하는게 아님 

    추적해야되는 값 : 누적연산값, idx

*/
/*
    주어진 숫자를 하나하나 선택에서 
    +혹은 -로 다음 숫자랑 연산해주는 방식으로 
    모든 숫자들을 다 연산해본다.
    그 다음에 target이랑 같으면 이 경우 cnt++

    numbers.length 가 n일때
    + or - 2개씩 n번 진행되므로 O(2^n)
*/

/*
    추적해야되는건
    numbers[i] 에 쓸 idx
    누적되고 있는 연산 값 val
*/