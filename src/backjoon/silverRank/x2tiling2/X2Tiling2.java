package backjoon.silverRank.x2tiling2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class X2Tiling2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        var result = countTile2(n);
        System.out.println(result);
    }

    private static int countTile2(int n) {
        if (n == 1) return 1;
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 3;

        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 1] + 2 * dp[i - 2]) % 10_007;
        }
        return dp[n];
    }
}
