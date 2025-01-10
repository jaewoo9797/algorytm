package backjoon.silverRank.minimumheap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class MinimumHeap {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] input = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = Integer.parseInt(br.readLine());
        }

        var result = calculateBy(input);
        result.forEach(System.out::println);
    }

    private static List<Integer> calculateBy(int[] inputs) {
        Queue<Integer> q = new PriorityQueue<>(100_000);
        List<Integer> result = new ArrayList<>();

        for (int input : inputs) {
            if (input == 0 && q.isEmpty()) {
                result.add(0);
            } else if (input == 0) {
                result.add(q.poll());
            } else {
                q.add(input);
            }
        }
        return result;
    }
}