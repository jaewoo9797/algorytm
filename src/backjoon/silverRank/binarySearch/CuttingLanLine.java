package backjoon.silverRank.binarySearch;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CuttingLanLine {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[k];
        for (int i = 0; i < k; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        var solution = solution(n, arr);
        bw.write(solution + "\n");
        bw.flush();
        bw.close();
    }

    private static long solution(int n, int[] arr) {
        var result = 0L;
        var lt = 1L;
        long rt = Arrays.stream(arr)
                .max()
                .orElseThrow();
        while(lt<=rt) {
            // 중앙값 구하기
            var mid = (lt + rt) / 2;

            int sum = 0;
            for (int x : arr) {
                sum += x/mid;
            }
            // 반복문 탈출 하기 위해서 어떻게 해야하는지 ?
            if (sum >= n) {
                result = mid;
                lt = mid + 1;
            } else {
                rt = mid -1;
            }
        }
        return result;
    }
}
