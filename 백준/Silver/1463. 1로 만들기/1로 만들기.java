import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] dp = new int[n + 1];
        dp[1] = 0; // 1은 아무 연산 필요 없음

        for (int i = 2; i <= n; i++) {
            // -1은 항상 수행
            dp[i] = dp[i - 1] + 1;

            // 3으로 나눠지면
            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            }

            // 2로 나눠지면
            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            }
        }

        System.out.println(dp[n]);
    }
}

// dp[k] 를 k를 1로 만드는데까지의 연산 횟수라고 둔다.
// 다음 세 가지를 분기해서 수행함
// 1. k가 3으로 나눠질때
// 2. k가 2로 나눠질때
// 3. -1수행

// 6, 12같은 공유되는 값이 있는 경우 경로가 여러가지있으므로 그 중 최소를 찾아줘야한다
// 어떤 경우에 최소경로가 되는지 알아야하므로 매 분기 수행마다 min으로 비교해서 더 작은 경우의수를 넣어줌