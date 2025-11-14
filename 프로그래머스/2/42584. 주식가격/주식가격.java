import java.util.Stack;

class Solution {
    public int[] solution(int[] prices) {
        Stack<Integer> stack = new Stack<>();
        int len = prices.length;
        int[] result = new int[len];

        for (int i = 0; i < len; i++) {
            while (!stack.isEmpty()) {
                if (prices[stack.peek()] > prices[i]) {
                    int curIdx = stack.pop();
                    result[curIdx] = i - curIdx;
                } else {
                    break;
                }
            }
            stack.push(i);
        }
        
        while (!stack.isEmpty()) {
            int curIdx = stack.pop();
            result[curIdx] = len - curIdx - 1;
        }

        return result;
    }
}
/*
    p[i]를 i++하면서 prices 요소를 전부 비교하면 O(n^2) 걸려서 안됨
    스택을 써서 하나의 상태를 가지고 p를 돌면서 1회 스캔만으로 비교시키면 O(n)
    
    인덱스 정보를 알아함
    
    스택에 <가격값,인덱스> 이렇게 넣을 필요 없이
    스택에 인덱스를 넣고 stack[p[i]] 이렇게 해서 인덱스만 추적하도록 함

    만약 반복에서 p[stack.peek()] < p[i] 면 끝까지 안떨어졌음
    단 한번도 안떨어진 애들이 계속 있으므로 가격이 떨어진적 있는 애들은 pop쳐서 바로 curIdx 담아주고
    i++ 되면서 계속 이전에 안떨어진 가격애들이랑 비교
    그럼 스택에 계속 남아있음 -> 따로 후처리 해줘야됨
    
    p[stack.peek()] > p[i] 면 떨어졌음, 그 즉시 stack.top의 index를 저장
    한 번이라도 떨어졌으면 바로 idx 넣어줘야함
    curIdx = i - stack.top.idx

    i++ 마다 스택에 push해서 새로운 요소를 비교대상으로 갱신

*/
