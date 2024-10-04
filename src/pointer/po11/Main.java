package pointer.po11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {

    public int solution(int n, int k, int[] arr) {
        int answer = -1;
        TreeSet<Integer> tSet = new TreeSet<>(Collections.reverseOrder());
        for (int i =0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                for (int l= j+1; l<n; l++) {
                    tSet.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }
        int cnt =0;
        for (int x : tSet) {
            cnt++;
            if(cnt==k) {
                return x;
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // n : N장의 카드의 수, k : k번 째로 큰 수
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(T.solution(n ,k ,arr));
    }
}
