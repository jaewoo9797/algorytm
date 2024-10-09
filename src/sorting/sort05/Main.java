package sorting.sort05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public String solution(int n, int[] arr) {
        String answer = "U";    // 처음에는 U (중복된 값이 없는 경우)
        Arrays.sort(arr);
        for (int i=0; i<n-1; i++) {
            if (arr[i] == arr[i+1]) return "D";
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(T.solution(n, arr));
    }
}
