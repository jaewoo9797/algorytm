package backjoon.silverRank.summingsection;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class SummingSections {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());   // 수의 개수
        int[] numberArray = new int[N];

        int M = Integer.parseInt(st.nextToken());   // 합을 구해야 하는 횟수

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            numberArray[i] = Integer.parseInt(st.nextToken());
        }

        var memo = calculateSummingSection(numberArray);

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int startIndex = Integer.parseInt(st.nextToken());
            int endIndex = Integer.parseInt(st.nextToken());
            var result = calculateSumOfIndex(memo, startIndex, endIndex);
            bw.write(result + "\n");
        }

        bw.flush();
        bw.close();
    }

    private static int calculateSumOfIndex(int[] memo, int startIndex, int endIndex) {
        return memo[endIndex] - memo[startIndex - 1];
    }

    private static int[] calculateSummingSection(int[] numberArray) {
        int[] memo = new int[numberArray.length + 1];


        for (int i = 1; i <= numberArray.length; i++) {
            memo[i] = memo[i-1] + numberArray[i - 1];
        }

        return memo;
    }
}
