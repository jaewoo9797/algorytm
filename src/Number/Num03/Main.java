package Number.Num03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public ArrayList<String> solution(int[] a, int[] b, int n) {
        ArrayList<String>  answer = new ArrayList<>();
        /*
        * 1:가위, 2:바위, 3:보
        * */
        for (int i = 0; i < n; i++) {
            int result = (a[i]-b[i]+3)%3;
            if(result == 1) answer.add("A");
            else if(result ==2) answer.add("B");
            else answer.add("D");
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] a = new int[N];
        int[] b = new int[N];
        String[] inputA = br.readLine().split(" ");
        String[] inputB = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(inputA[i]);
            b[i] = Integer.parseInt(inputB[i]);
        }
        T.solution(a, b, N).forEach(System.out::println);
    }
}
