package Number.Num05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public int solution(int N) {
        int answer = 0;
        int[] arr = new int[N+1];
        for(int i = 2; i<= N; i++) {
            if(arr[i] == 0) {
                answer++;
                for(int j = i; j<= N; j = j+i) arr[j] = 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(T.solution(N));
    }
}
