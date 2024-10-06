package stack.스택03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public int solution(int n, int[][] arr, int m, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        // moves 순회
        for (int pos : moves) {
            for (int i=0; i<arr.length; i++) {
                if (arr[i][pos - 1] != 0) {
                    int temp = arr[i][pos - 1];
                    arr[i][pos - 1] = 0;
                    if (!stack.isEmpty() && temp == stack.peek()) {
                        answer +=2;
                        stack.pop();
                    } else stack.push(temp);
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];    //board 2차원 배열
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int m = Integer.parseInt(br.readLine());    // 크레인을 움직여 뽑은 횟수
        int[] moves = new int[m];
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<m; i++) {
            moves[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(T.solution(n, arr, m, moves));
    }
}