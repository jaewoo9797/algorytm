package Number.Num07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public int solution(int n, int[] arr) {
        int answer = 0;
        int accumulator = 0;
        for (int i=0; i<n; i++) {
            if(arr[i] == 0) {
                accumulator = 0;
                continue;
            } else {
                accumulator++;
                answer += accumulator;
            }
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String[] str = br.readLine().split(" ");
        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        System.out.println(T.solution(n, arr));
    }
}