package backjoon.silverRank.lostbrace;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LostBrace {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        var inputStr = br.readLine();
        var result = calculateMinValue(inputStr);
        System.out.println(result);
    }

    private static long calculateMinValue(String inputStr) {
        long sum = 0L;

        var group = inputStr.split("-");

        for (int i = 0; i < group.length; i++) {
            int temp = 0;

            var numbers = group[i].split("\\+");

            for (String number : numbers) {
                temp += Integer.parseInt(number);
            }

            if (i == 0) {
                sum += temp;
            } else {
                sum -= temp;
            }
        }

        return sum;
    }
}
