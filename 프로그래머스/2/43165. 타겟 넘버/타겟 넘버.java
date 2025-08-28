import java.util.*;

class Solution {
    public int solution(int[] numbers, int target) {
        Stack<State> st = new Stack<>();
        st.add(new State(0, 0));
        int count = 0;

        while (!st.isEmpty()) {
            State cur = st.pop();

            if (cur.index == numbers.length) {
                if (cur.acc == target) {
                    count++;
                }
                continue;
            }

            st.push(new State(cur.index + 1, cur.acc + numbers[cur.index]));
            st.push(new State(cur.index + 1, cur.acc - numbers[cur.index]));

        }
        
        return count;
    }


    private static class State {
        private final int index;
        private final int acc; //accumulated

        State(int index, int acc) {
            this.index = index;
            this.acc = acc;
        }
    }
}
