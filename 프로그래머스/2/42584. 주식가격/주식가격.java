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
    p[i]랑 p[k>i] 랑 비교했을 때 값이 작아지면 떨어진거임
    그러면 idx:k - idx:i 값을 result[]에 저장
    만약 끝까지 떨어지지않은 p[i]는
    p.length - idx:i 해서 저장

    근데 문제는 가격마다 그 시점의 인덱스를 알고있어야됨
    그리고 p[i]를 i++하면서 계속 반복비교하면 O(n^2)인데 n=10만이니까 안됨
    stack으로 idx를 저장하도록 해서 비교대상을 stack에 넣고,
    값이 떨어지면 result[]에 넣고 pop
    그러면 끝까지 안떨어진애들은 stack에 남아있을거니까 따로 후처리
*/
