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
    O(n^2)로 푸는게 직관적으로 떠오르지만
    10만x10만 이므로 안됨

    n^2으로 돌지 않으면서 요소를 쭉 스캔할 수 있는건 스택임
    반복문 내에서 현재요소에 대한 비교만 계속 하면 되므로
    현재 요소를 스택에 넣고(top) 이랑 prices[i]랑 비교하면 된다. 
    그럼 for한번 내에서 풀스캔 가능

    시점을 알아야하므로 스택에는 idx를 넣고 
    값은 stack 요소가 인덱스니까 prices[stack.peek()] 로 뽑으면 되니까 idx만 넣으면 됨

    top보다 작은 애가 나오면 떨어진거니까 그때의 idx랑 반복자i값이랑 차이를 빼면
    두 거리가 나오니 이걸 result로 쓴다.

    --- 

    근데 끝까지 가격이 안떨어진애들이 있을거임
    그럼 얘들은 스택에 계속 남아있다.
    얘내는 마지막idx까지의 거리만 구해서 넣어주면 됨 
    그러면 동시에 마지막 요소도 처리가 됨
    0based니까 len-1이랑 빼줘야됨

*/