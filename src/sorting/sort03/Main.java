package sorting.sort03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public int[] solution(int n , int[] arr) {
        for (int i=0; i<n-1; i++) {
            int min = Integer.MAX_VALUE;
            int idx = 0;
            for (int j=i; j<n; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    idx = j;
                }
            }
            int temp = arr[i];
            arr[i] = min;
            arr[idx] = temp;
        }

        return arr;
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
        for(int x : T.solution(n, arr)) {
            System.out.print(x+ " ");
        };
    }
}
