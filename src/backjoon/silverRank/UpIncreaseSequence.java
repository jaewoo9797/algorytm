package backjoon.silverRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class UpIncreaseSequence {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] input = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            input[i] = Integer.parseInt(st.nextToken());
        }

        var result = calcMaxLength(input);
        System.out.println(result);
    }

    private static int calcMaxLength(int[] input) {
        int[] dp = new int[input.length];
        Arrays.fill(dp, 1);

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < i; j++) {
                if (input[j] < input[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        return max(dp);
    }

    private static int max(int[] calcArr) {
        int max = Integer.MIN_VALUE;
        for (int x : calcArr) {
            max = Math.max(max, x);
        }
        return max;
    }
}
