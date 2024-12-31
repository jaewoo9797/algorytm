package backjoon.silverRank.stepup;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class StepUp {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());  // 계단 수
        int[] stairs = new int[n + 1];  // 계단 정수
        int[] dp = new int[n + 1];  // DP 배열

        for (int i = 1; i <= n; i++) {
            stairs[i] = Integer.parseInt(br.readLine());
        }

        var max = calculateMax(n, stairs, dp);


        bw.write(max + "\n");
        bw.flush();
        bw.close();
    }

    private static int calculateMax(int n, int[] stairs, int[] dp) {
        if (n == 1) {
            return stairs[1];
        }

        // 초기값 설정
        dp[1] = stairs[1];
        dp[2] = dp[1] + stairs[2];

        for (int i = 3; i <= n; i++) {
            dp[i] = Math.max(dp[i-2] + stairs[i], dp[i-3] + stairs[i - 1] + stairs[i]);
        }

        return dp[n];
    }

}
