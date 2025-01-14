package backjoon.silverRank.make1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Make1Re {
    static int[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputNum = Integer.parseInt(br.readLine());
        var result = makeOne(inputNum);
        System.out.println(result);
    }

    private static int makeOne(int inputNum) {
        int count = 0;
        dp = new int[inputNum + 1];
        dp[0] = 0;
        dp[1] = 0;

        for (int i =2; i <= inputNum; i++) {
            dp[i] = dp[i-1] + 1;

            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            }

            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            }
        }
        return dp[inputNum];
    }
}

/**
 * 1
 * 2>1
 * 3>1
 * 4>2>1, 4>3>1
 * 5>4>2>1
 * 6->3>1
 * 7>6>3>1
 * 8>4>2>1, 8>4>3>1
 * 9>3>1
 * 10>9>3>1
 */