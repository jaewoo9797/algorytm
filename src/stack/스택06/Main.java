package stack.스택06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public int solution(int n, int k) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }
        while (queue.size() != 1) {
            for(int i=1; i<=k; i++) {
                // k를 외친 사람은 poll()
                if (i == k) {
                    queue.poll();
                }
                // 나머지 사람은 poll() 한 후 offer()
                else {
                    int in = queue.poll();
                    queue.offer(in);
                }
            }
        }
        return queue.poll();
    }
    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        System.out.println(T.solution(n, k));
    }
}
