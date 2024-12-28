package backjoon.silverRank.coinzero.greedyAlgorithm.knapsackProblem;

import java.util.Arrays;
import java.util.Comparator;

public class FactionalKnapSack {


    static class ItemValue {

        int profit, weight;

        public ItemValue(int profit, int weight) {
            this.profit = profit;
            this.weight = weight;
        }

    }

    public static void main(String[] args) {
        ItemValue[] arr = {
                new ItemValue(60, 10),
                new ItemValue(100, 20),
                new ItemValue(120, 30),
        };

        int capacity = 50;

        var maxValue = getMaxValue(arr, capacity);
        System.out.println("maxValue = " + maxValue);
    }

    private static double getMaxValue(ItemValue[] arr, int capacity) {
//        Comparator<ItemValue> comparator = Comparator.comparingDouble(o -> (double) o.profit / o.weight);
        // Sorting items by profit/weight ratio;
        Arrays.sort(arr, new Comparator<ItemValue>() {
            @Override
            public int compare(ItemValue o1, ItemValue o2) {
                double cpr1 = (double) o1.profit / o1.weight;
                double cpr2 = (double) o2.profit / o2.weight;
                return Double.compare(cpr2, cpr1);
            }
        });

//        Arrays.sort(arr, comparator);

        double totalValue = 0;

        for (ItemValue item : arr) {

            int currentWeight = item.weight;
            int currentProfit = item.profit;

            if (capacity - currentWeight >= 0) {
                capacity -= currentWeight;
                totalValue += currentProfit;
            } else {
                // Item cant be picked whole
                double fraction
                        = ((double) capacity / (double) currentWeight);

                totalValue += (currentProfit * fraction);

                capacity =
                        (int) (capacity - (currentWeight * fraction));
                break;
            }
        }
        return totalValue;
    }


}
