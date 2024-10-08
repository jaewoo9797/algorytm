package sorting.sort04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public int[] solution (int size, int n, int[] arr) {
        int[] answer = new int[size];
        for (int x : arr) {
            int pos = -1;
            for (int i=0; i<size; i++) if(x == arr[i]) pos = i; // 캐시 메모리에 존재하는지 검사
            if (pos == -1) {    // 캐시 메모리에 없을 때
                for (int i= size -1; i >= 1; i--) {
                    answer[i] = answer[i-1];
                }
                answer[0] = x;
            } else {    // 캐시 메모리에 값이 있을 경우
                for (int i=pos; i>=1; i--) {
                    answer[i] = answer[i-1];
                }
                answer[0] = x;
            }
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());   // 작업 크기
        int n = Integer.parseInt(st.nextToken());   // 작업 개수
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for (int x : T.solution(s, n, arr)) {
            System.out.print(x+ " ");
        }
    }
}
