package backjoon.silverRank.x2tiling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NTiling2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        // 채우는 방법의 수를 10_007로 나눈 나머지를 출력한다.
        var count = calculateTilingCount(N);
        System.out.println(count
        );
    }

    private static int calculateTilingCount(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 10_007;
        }

        return dp[n];
    }
}
