package backjoon.print;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCount = Integer.parseInt(br.readLine());
        StringTokenizer st = null;
        for (int i = 0; i < testCount; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            int[] priorities = new int[n];
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                priorities[j] = Integer.parseInt(st.nextToken());
            }

            solution(n, m, priorities);
        }
        bw.flush();
        bw.close();
    }

    private static void solution(int n, int m, int[] priorities) {
        Queue<Integer> que = new LinkedList<Integer>();
        for (int i = 1; i <= n; i++) {
            que.add(i);
        }
        System.out.println("que = " + que);
    }


}
