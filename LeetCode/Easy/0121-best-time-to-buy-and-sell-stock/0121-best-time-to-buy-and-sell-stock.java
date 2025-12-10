import java.util.Stack;

class Solution {
    public int maxProfit(int[] prices) {
        
        Stack<Integer> stack = new Stack<>();
        int len = prices.length;

        int max = -1;

        for(int i=0; i<len; i++) {
            if(stack.isEmpty()) {
                stack.push(prices[i]);
            } else {
                if(stack.peek() > prices[i]) {
                    max = Math.max(max, prices[i] - stack.pop());
                    stack.push(prices[i]);
                } else {
                    max = Math.max(max, prices[i] - stack.peek());
                }
            }
        }

        if(max == -1) {
            return 0;
        } else {
            return max;
        }
    }
}



/*
    스택을 써서 순회하는 값이 지금보다 작은 경우에 push, 이전값은 pop 
    그러면 스택에는 계속 작은 값이들어있을건데
    순회때마다 값차이를 계속 갱신해서 들고있는다? 
    현재 시점 기준으로만 세면 되므로 스택으로 가능




    ex) [7,1,5,3,6,4] 에서
    1) stack.push(7)
    2) top(7) > 1 이므로 stack.push(1), stack.pop(), max = 1-7
    3) top(1) < 5 이므로 push/pop 안함, max()
    4) top(1) < 3 이므로 push/pop 안함, max(4,3-1) -> 4
    5) top(1) < 6 이므로 push/pop 안함, max(4,6-1) -> 5
    6) top(1) < 4 이므로 push/pop 안함, max(5, 4-1) -> 5

    ex) [7,6,4,3,1] 에서 초기max=0
    1) stack.push(7)
    2) top(7) > 6 이므로 push(6), pop, max(0,6-7)
    3) top(6) > 4 이므로 push(4), pop, max(0,4-6)
    4) top(4) > 3 이므로 push(3), pop, max(0,3-4)
    5) top(3) > 1 이므로 push(1), pop, max(0,1-3)
    max가 초기값보다 작으므로 return 0
*/

