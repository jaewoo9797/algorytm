package study.stackpractice.스택09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int solution(int n, int k) {
        Queue<Integer> queue = new LinkedList<>();
        int answer = 0;
        for (int i =1; i<=n; i++) {
            queue.offer(i);
        }
        while (!queue.isEmpty()) {
            for (int j = 1; j < k; j++) {
                queue.offer(queue.poll());
            }
            queue.poll();
            if (queue.size() == 1) {
                answer = queue.poll();
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        System.out.println(solution(n, k));
    }
}
