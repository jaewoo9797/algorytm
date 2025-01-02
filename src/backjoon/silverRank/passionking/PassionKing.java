package backjoon.silverRank.passionking;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class PassionKing {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String[] inputLines = new String[n];
            for (int i = 0; i < n; i++) {
                inputLines[i] = br.readLine();
            }
            var result = calculateNumberOfCases(n, inputLines);
            bw.write(result + "\n");
        }

        bw.flush();
        bw.close();
    }

    private static int calculateNumberOfCases(int n, String[] inputLines) {
        var init = init(inputLines);

        int result = 1;
        for (int count : init.values()) {
            result *= (count + 1);
        }
        return result - 1;
    }

    static Map<String, Integer> init(String[] inputLines) {
        Map<String, Integer> map = new HashMap<>();
        for (String line : inputLines) {
            var s = line.split(" ");
            var category = s[1];
            var itemName = s[0];
            map.put(category, map.getOrDefault(category, 0) + 1);
        }
        return map;
    }
}
