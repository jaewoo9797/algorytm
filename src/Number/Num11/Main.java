package Number.Num11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    /*
    * 각 학생(행) 마다 같은 반 이 된 적이 있는지 확인하여 count한 후 max값과 비교하여
    * */
    public int solution(int n, int[][] arr) {
        int answer = 0, max=Integer.MIN_VALUE; // 학생 번호
        for (int i = 1; i <= n; i++) {
            int cnt = 0;
            for (int j = 1; j <=n; j++) {
                for (int k=1; k<=5; k++) {
                    if(arr[i][k] == arr[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }
            if(cnt > max) {
                max = cnt;
                answer = i;
            }
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n+1][6];
        for (int i=1; i<=n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j=1; j<=5; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        System.out.println(T.solution(n, arr));
    }
}
