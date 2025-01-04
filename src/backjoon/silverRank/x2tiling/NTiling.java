package backjoon.silverRank.x2tiling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NTiling {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        var result = countTile(n);
        System.out.println(result);
    }

    private static int countTile(int n) {
        int[] memo = new int[n + 1];
        Arrays.fill(memo,-1);
        return countTileRecu(n,memo);
    }

    private static int countTileRecu(int n, int[] memo) {
        if (n == 1) {
            return 1;
        }

        if (n == 2) {
            return 2;
        }

        if (memo[n] != -1) {
            return memo[n];
        }

        return memo[n] = (countTileRecu(n - 1, memo) + countTileRecu(n - 2, memo)) % 10_007;
    }
}
