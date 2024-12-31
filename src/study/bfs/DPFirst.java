package study.bfs;

import java.util.Arrays;
import java.util.StringJoiner;

public class DPFirst {

    private static long fibRec(int n, long[] memo) {

        // Base Case
        if (n <= 1) {
            return n;
        }

        // To Check if output already exists
        if (memo[n] != -1) {
            return memo[n];
        }

        // Calculate and Save output for future use
        return memo[n] = fibRec(n - 1, memo) + fibRec(n - 2, memo);
    }

    private static long fib(int n) {
        long[] memo = new long[n + 1];
        Arrays.fill(memo, -1);
        memo[0] = 0;
        memo[1] = 1;

        var result = fibRec(n, memo);
        StringJoiner sj = new StringJoiner(" ");
        for (long x : memo) {
            sj.add(String.valueOf(x));
        }
        System.out.println(sj);
        return result;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("fib(n) = " + fib(n));
    }
}
