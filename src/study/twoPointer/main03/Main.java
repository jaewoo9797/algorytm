package study.twoPointer.main03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public int solution(int n, int m, int[] arr) {
        int answer = Integer.MIN_VALUE;
        int lt = 0, rt = 0;
        int sum = 0;
        for (int i =0; i<m; i++) {
            sum += arr[rt++];
        }
        answer = Math.max(answer, sum);
        while (rt < n) {
            sum += arr[rt++];
            sum -= arr[lt++];
            answer = Math.max(answer, sum);
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i =0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(T.solution(n, m, arr));
    }
}
