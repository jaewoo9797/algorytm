package pointer.po04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public int solution(int n, int m, int[] arr) {
        // 특정 숫자 m이 되는 경우의 수 찾기
        int answer = 0;
        int sum = 0;
        int left = 0;
        for (int right = 0; right < n; right++) {
            sum += arr[right];

            while (sum > m) {
                sum -= arr[left++];
            }
            if (sum == m) answer++;
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(T.solution(N, K, arr));
    }
}
