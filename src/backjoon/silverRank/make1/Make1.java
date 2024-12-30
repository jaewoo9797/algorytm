package backjoon.silverRank.make1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Make1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] dp = new int[N + 1];
        dp[1] = 0;

        for (int i = 2; i <= N; i++) {
            // 기본적으로 이전 값에서 +1 계산
            dp[i] = dp[i - 1] + 1;

            // 2로 나누어 떨어지는 경우 최소값 갱신
            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            }
            
            // 3으로 나누어 떨어지는 경우 최소값 갱신
            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            }
        }

        System.out.println("dp[N] = " + dp[N]);
    }
}
