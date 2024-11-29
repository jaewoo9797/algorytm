package study.sort.sort3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class Main {
    public static int[] solution(int n, int[] arr) {
        for (int i = 1; i < n; i++) {
            int key = arr[i];   //현재 삽입할 요소
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
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
        int[] result = solution(n, arr);
        for (int i = 0; i < n; i++) {
            sj.add(String.valueOf(result[i]));
        }
        System.out.println(sj.toString());
    }
}
