import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }

        // 낮은 액수부터 더하면 최소가짓수를 알기 힘듬
        // 액수가 큰것부터 차감시키고 개수를 누적시킨다.
        int cnt = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (coins[i] <= k) {
                cnt += k / coins[i];
                k %= coins[i];
            }
        }
        System.out.println(cnt);
    }
}

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int k = sc.nextInt();
//         int[] coins = new int[n];
//         for (int i = 0; i < n; i++) coins[i] = sc.nextInt();

//         int cnt = 0;
//         for (int i = n - 1; i >= 0; i--) {
//             if (coins[i] <= k) {
//                 cnt += k / coins[i];
//                 k %= coins[i];
//             }
//         }
//         System.out.println(cnt);
//     }
// }