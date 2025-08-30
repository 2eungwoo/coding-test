import java.util.*;

public class Main {

    private static int a;
    private static int k;
    private static boolean[] visited;
    private final static int SIZE = 1000000;
    private static int answer = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        k = sc.nextInt();

        visited = new boolean[SIZE + 1];
        answer = dfs(new State(a, 0));

        System.out.println(answer);

    }   

    private static int dfs(State state) {
        Queue<State> q = new LinkedList<>();
        q.add(state);

        while (!q.isEmpty()) {
            State cur = q.poll();

            if (cur.num == k) {
                return cur.depth;
            }
     
            if (cur.num + 1 <= k && !visited[cur.num + 1]) {
                visited[cur.num + 1] = true;
                q.add(new State(cur.num + 1, cur.depth + 1));
            }
            if (cur.num * 2 <= k && !visited[cur.num * 2]) {
                visited[cur.num + 1] = true;
                q.add(new State(cur.num * 2, cur.depth + 1));
            }
        }
        return -1;
    }
    
    private static class State {
        private final int num;
        private final int depth;

        public State(int num, int depth) {
            this.num = num;
            this.depth = depth;
        }
    }

}

