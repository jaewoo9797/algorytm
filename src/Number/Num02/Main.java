package Number.Num02;

import java.util.Scanner;

public class Main {
    public int solution(int n, int[] arr) {
        int answer = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++) {
            if(max < arr[i]) {
                answer++;
                max = arr[i];
            }
        }
        // 볼 수 있는 학생이 있을 경우 +1
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main T = new Main();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(n, arr));
    }
}
