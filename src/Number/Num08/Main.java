package Number.Num08;

import java.io.*;

public class Main {

    public int[] solution(int n, int[] arr) {
        int[] answer = new int[n];
        for (int i=0; i<n; i++) {
            int cnt = 1;
            for (int j=0; j<n; j++) {
                if(arr[i] < arr[j]) cnt++;
            }
            answer[i] = cnt;
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        String[] str = br.readLine().split(" ");
        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        for(int x : T.solution(N,arr)) {
            System.out.print(x + " ");
        }
    }
}
