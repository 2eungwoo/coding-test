import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            State start = new State(0, 0);
            int cnt = dfs(start, arr[i]);
            System.out.println(cnt);
        }
    }

    private static int dfs(State cur, int target) {
        if (cur.sum == target) {
            return 1; 
        }
        if (cur.sum > target) {
            return 0; 
        }

        return dfs(new State(cur.sum + 1, cur.depth + 1), target)
             + dfs(new State(cur.sum + 2, cur.depth + 1), target)
             + dfs(new State(cur.sum + 3, cur.depth + 1), target);
    }

    private static class State {
        private final int sum;
        private final int depth;

        public State(int sum, int depth) {
            this.sum = sum;
            this.depth = depth;
        }
    }
}