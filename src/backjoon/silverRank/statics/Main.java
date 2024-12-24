package backjoon.silverRank.statics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        var solution = solution(n, arr);
        StringBuilder sb = new StringBuilder();
        Arrays.stream(solution)
                .forEach(value -> {
                    sb.append(value).append(" ");
                });
        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
    }

    private static int[] solution(int n, int[] arr) {
        int[] result = new int[4];
        var i = calculateArithmeticMean(arr);
        result[0] = i;
        var i2 = calculateMedianValue(arr);
        result[1] = i2;
        var i3 = calculateMode(arr);
        result[2] = i3;
        var i4 = calculateRange(arr);
        result[3] = i4;
        return result;
    }

    private static int calculateArithmeticMean(int[] arr) {
        var sum = IntStream.of(arr).sum();
        var mean = Math.round(sum / (double) arr.length);
        return (int) mean;
    }

    private static int calculateMedianValue(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length / 2];
    }

    private static int calculateMode(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();
        Arrays.stream(arr)
                .forEach(value -> {
                    countMap.put(value, countMap.getOrDefault(value, 0) + 1);
                });

        var maxCount = Collections.max(countMap.values());

        var maxList = countMap.entrySet().stream()
                .filter(entry -> Objects.equals(entry.getValue(), maxCount))
                .map(Entry::getKey)
                .sorted()
                .collect(Collectors.toList());

        return maxList.size() > 1 ? maxList.get(1) : maxList.get(0);
    }

    private static int calculateRange(int[] arr) {
        int max = IntStream.of(arr).max().getAsInt();
        int min = IntStream.of(arr).min().getAsInt();
        return Math.abs(max - min);
    }
}
