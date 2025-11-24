import java.util.Stack;

class Solution {
    public int[] solution(int[] prices) {
        Stack<Integer> stack = new Stack<>();
        int len = prices.length;
        int[] result = new int[len];
        
        for(int i=0; i<len; i++) {
            while(!stack.isEmpty()) {
                if(prices[stack.peek()] > prices[i]) {
                    int curIdx = stack.pop();
                    result[curIdx] = i - curIdx;
                } else {
                    break;
                }
            }

            stack.push(i);
        }

        while(!stack.isEmpty()) {
            int curIdx = stack.pop();
            result[curIdx] = len - curIdx - 1;
        }

        return result;
    }
}

/* 
    p[i]를 하나하나 다 비교해가면서 떨어졌는지 아닌지 비교할 순 없음
    O(N^2) 이라 100000^2에 통과 못함

    인덱스 정보를 스택에 유지하면서
    prices[stack.peek()]랑 prices[]만 비교를 함
    그러면 가격이 떨어진 순간이 있을건데 그 때 idx랑 stack.peek()에 있는 idx랑 비교해서 뺀다음
    그걸 result[]에 넣는다
    근데 만약 또 peek랑 p[i]랑 비교헀는데 p[i]가 더 크면 즉시 멈춰서
    다음 idx를 stack push해서 새로 비교하도록함

    그럼 이제 스택에 남아잇는 애들이 있음
    stack에다가 prices의 모든 요소에 대한 인덱스를 넣었는데 
    떨어진 애들만 팝 쳤으니 끝까지 안떨어진애들은 스택에 남아있을거임
    따라서 한번 더 1회 스캔 돌면서 처리해준다
*/