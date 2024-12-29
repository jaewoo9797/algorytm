package backjoon.silverRank.atm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Atm {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] peoples = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            peoples[i] = Integer.parseInt(st.nextToken());
        }

        var result = calculateMinSum(n, peoples);
        bw.write(result + "\n");

        bw.flush();
        bw.close();

    }

    private static int calculateMinSum(int n, int[] peoples) {
        int[] times = new int[n + 1];
        Arrays.sort(peoples);
        for (int i = 1; i <= n; i++) {
            times[i] = peoples[i - 1] + times[i - 1];
        }
        return Arrays.stream(times).sum();
    }
}
