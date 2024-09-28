package Number.Num06;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i=2; i<= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i=0; i<n; i++) {
            if (isPrime(arr[i])) {
                answer.add(arr[i]);
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main T =  new Main();
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // N 개의 수
        int n = Integer.parseInt(br.readLine());
        // 입력받은 수 N개
        int[] arr = new int[n];
        String[] temp = br.readLine().split(" ");
        for(int i=0;i<n;i++) {
            String a = sb.append(temp[i]).reverse().toString();
            arr[i] = Integer.parseInt(a);
            sb.setLength(0);
        }
        T.solution(n, arr).forEach((x) -> System.out.print(x+" "));
    }
}
