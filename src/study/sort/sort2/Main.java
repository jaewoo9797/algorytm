package study.sort.sort2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class Main {

    public static int[] solution(int n, int[] arr) {
        for (int i = n; i > 0; i--) {
            for (int j = 0; j - 1 < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        StringJoiner sj = new StringJoiner(" ");
        for (int x : solution(n, arr)) {
            sj.add(String.valueOf(x));
        }
        System.out.println(sj.toString());
    }
}
