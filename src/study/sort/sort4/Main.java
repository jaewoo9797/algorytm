package study.sort.sort4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class Main {
    public static int[] solution(int s, int n, int[] arr) {
        int[] result = new int[s];
        for (int target : arr) {
            int idx = 0;
            for (int j = 0; j < s; j++) {
                if (target == result[j]) {
                    idx = j;
                    break;
                }
            }
            if (!(idx == 0)) {
                for (int j = idx; j > 0; j--) {
                    result[j] = result[j -1];
                }
            } else {
                for (int j = s-1; j > 0; j--) {
                    result[j] = result[j -1];
                }
            }
            result[0] = target;
        }
        return result;
    }



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());   // 캐시의 사이즈
        int n = Integer.parseInt(st.nextToken());   // 작업의 개수

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        var result = solution(s, n, arr);
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 0; i < s; i++) {
            sj.add(String.valueOf(result[i]));
        }
        System.out.println(sj.toString());
    }
}
