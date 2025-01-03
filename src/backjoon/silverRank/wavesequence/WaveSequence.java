package backjoon.silverRank.wavesequence;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class WaveSequence {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCount = Integer.parseInt(br.readLine());
        for (int i = 0; i < testCount; i++) {
            int N = Integer.parseInt(br.readLine());
            var result = calculateNum2(N);
            bw.write(result + "\n");
        }

        bw.flush();
        bw.close();
    }

    private static long calculateNum2(int n) {
        long[] memo = new long[n+1];
        Arrays.fill(memo,-1);
        return dpRec(n, memo);
    }

    private static long dpRec(int n, long[] memo) {
        if (n <= 3) {
            return 1L;
        }
        if (n == 4 || n ==5) {
            return 2L;
        }

        if (memo[n] != -1) {
            return memo[n];
        }
        memo[1] = 1L;
        memo[2] = 1L;
        memo[3] = 1L;
        memo[4] = 2L;
        memo[5] = 2L;

        return memo[n] = dpRec(n-1, memo) + dpRec(n-5, memo);
    }
}
