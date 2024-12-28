package backjoon.silverRank.coinzero.greedyAlgorithm;

import java.util.Arrays;

public class GFGGreedyTest {

    public static void main(String[] args) {
        int[] coins = {5, 2, 10, 1};
        int amount = 39;

        var minCoins = minCoins(coins, amount);
        System.out.println("minCoins = " + minCoins);
    }

    private static int minCoins(int[] coins, int amount) {
        int n = coins.length;
        Arrays.sort(coins);
        int count = 0;

        for (int i = n - 1; i >= 0; i--) {
            if (amount >= coins[i]) {

                count += amount/coins[i];

                amount %= coins[i];
            }

            if (amount == 0) {
                break;
            }
        }

        return count;
    }
}
