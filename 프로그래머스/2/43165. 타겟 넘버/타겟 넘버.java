import java.util.Stack;

class Solution {
    public int solution(int[] numbers, int target) {
        Stack<State> stack = new Stack<>();
        stack.push(new State(0, 0));
        
        int count = 0;

        while (!stack.isEmpty()) {
            State cur = stack.pop();

            if (cur.index == numbers.length) {
                if (cur.acc == target) {
                    count++;
                }
                continue;
            }

            stack.push(new State(cur.index + 1, cur.acc + numbers[cur.index]));
            stack.push(new State(cur.index + 1, cur.acc - numbers[cur.index]));
        }
        
        return count;

    }
    
    private class State {
        private final int index;
        private final int acc;

        State(int index, int acc) {
            this.index = index;
            this.acc = acc;
        }
    }
}
