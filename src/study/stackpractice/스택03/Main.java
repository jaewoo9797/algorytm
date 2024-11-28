package study.stackpractice.스택03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] nArr = new int[n][n];
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                nArr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int m = Integer.parseInt(br.readLine());
        st=new StringTokenizer(br.readLine());
        int[] mArr = new int[m];
        for (int i = 0; i < m; i++) {
            mArr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(solution(n,nArr,m,mArr));
    }

    static int solution(int n, int[][] arr, int m, int[] moves) {
        int answer = 0;

        return answer;
    }
}
