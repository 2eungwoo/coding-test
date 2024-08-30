import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static List<Integer>[] adj;
    static boolean[] vis;

    public static void dfs(int cur) {
        vis[cur] = true;
        System.out.print(cur + " "); // 방문한 노드 출력
        for (int next : adj[cur]) {
            if (vis[next]) continue;
            dfs(next);
        }
    }

    public static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        vis[start] = true;
        while (!queue.isEmpty()) {
            int cur = queue.poll();
            System.out.print(cur + " "); // 방문한 노드 출력
            for (int next : adj[cur]) {
                if (vis[next]) continue;
                queue.add(next);
                vis[next] = true;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int start = scanner.nextInt();
        adj = new ArrayList[n + 1];
        vis = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            adj[i] = new ArrayList<>();
        }

        while (m-- > 0) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            adj[u].add(v);
            adj[v].add(u);
        }

        // 노드 번호가 작은 것을 먼저 방문하기 위한 정렬
        for (int i = 1; i <= n; i++) {
            adj[i].sort(null);
        }
        /*
        for(int i=1; i<=n; i++){
            Collections.sort(adj[i]);
        }

         */

        dfs(start);
        System.out.println();

        vis = new boolean[n + 1]; // 방문 배열 초기화
        bfs(start);
    }
}
