import java.util.Stack;

class Solution {
    public int solution(int[] numbers, int target) {
        Stack<State> stack = new Stack<>();
        stack.push(new State(0, 0));

        int cnt = 0;
        while (!stack.isEmpty()) {
            State cur = stack.pop();

            if (cur.depth == numbers.length) {
                if (cur.acc == target) {
                    cnt++;
                }
            }

            else if (cur.depth < numbers.length) {
                stack.push(new State(cur.acc + numbers[cur.depth], cur.depth + 1));
                stack.push(new State(cur.acc - numbers[cur.depth], cur.depth + 1));
            }
         }

        return cnt;
    }

    private class State {
        private final int acc;
        private final int depth;

        public State(int acc, int depth) {
            this.acc = acc;
            this.depth = depth;
        }
    }
}
