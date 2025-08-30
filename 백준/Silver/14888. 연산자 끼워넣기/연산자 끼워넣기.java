import java.util.*;

public class Main {

    private static int n;
    private static int[] nums;
    private static int[] ops;
    private static int max = Integer.MIN_VALUE;
    private static int min = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        n = sc.nextInt();
        
        nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        ops = new int[4];
        for (int i = 0; i < 4; i++) {
            ops[i] = sc.nextInt();
        }

        Stack<State> st = new Stack<>();
        st.push(new State(1, nums[0], ops[0], ops[1], ops[2], ops[3]));

        while (!st.isEmpty()) {
            State cur = st.pop();

            if (cur.idx == n) {
                max = Math.max(cur.val, max);
                min = Math.min(cur.val, min);
                continue;
            }

            int nextNum = nums[cur.idx];

            if (cur.plus > 0) {
                st.push(new State(cur.idx + 1, cur.val + nextNum, cur.plus - 1, cur.minus, cur.mul, cur.div));
            }
            
            if (cur.minus > 0) {
                st.push(new State(cur.idx + 1, cur.val - nextNum, cur.plus, cur.minus - 1, cur.mul, cur.div));
            }
            
            if (cur.mul > 0) {
                st.push(new State(cur.idx + 1, cur.val * nextNum, cur.plus, cur.minus, cur.mul - 1, cur.div));
            }
            
            if (cur.div > 0) {
                st.push(new State(cur.idx + 1, div(cur.val, nextNum), cur.plus, cur.minus, cur.mul, cur.div - 1));   
            }
        }
        System.out.println(max);
        System.out.println(min);
    }

    static int div(int a, int b) {
        return a / b;
    }

    private static class State {
        private final int idx;
        private final int val;
        private final int plus, minus, mul, div; // 남은 연산자 개수

        public State(int idx, int val, int plus, int minus, int mul, int div) {
            this.idx = idx;
            this.val = val;
            this.plus = plus;
            this.minus = minus;
            this.mul = mul;
            this.div = div;
        }
    }
}