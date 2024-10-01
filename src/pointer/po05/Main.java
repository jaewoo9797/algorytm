package pointer.po05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public int solution(int n) {
        int answer = 0;
        int left = 0, sum = 0;
        for (int right = 0; right < n; right++) {
            sum += right;

            while (sum > n) {
                sum -= left++;
            }

            if(sum == n) answer++;
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(T.solution(n));
    }
}
