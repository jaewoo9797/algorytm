package study.twoPointer.main04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public int solution (int n, int m, int[] arr) {
        int cnt =0;
        int sum = 0;
        int left=0;
        for (int right = 0; right < n; right++) {
            sum += arr[right];

            while(sum > m) {
                sum -= arr[left++];
            }
            if (sum == m) cnt++;
        }
        return cnt;
    }
    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(T.solution(n,m,arr));
    }
}
