package backjoon.silverRank.stepup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StepUp2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] inputNums = new int[T + 1];
        for (int i = 1; i <= T; i++) {
            inputNums[i] = Integer.parseInt(br.readLine());
        }
        var result = stopDpCount(T, inputNums);
        System.out.println(result);
    }

    private static long stopDpCount(int T, int[] stepNums) {
        if (T == 1) {
            return stepNums[1];
        }

        long[] dp = new long[T + 1];
        dp[1] = stepNums[1];
        dp[2] = stepNums[1] + stepNums[2];

        for (int i = 3; i <= T; i++) {
            dp[i] = Math.max(dp[i - 2], dp[i - 3] + stepNums[i - 1]) + stepNums[i];
        }
        return dp[T];
    }
}
