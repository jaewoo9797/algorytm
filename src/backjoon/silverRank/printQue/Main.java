package backjoon.silverRank.printQue;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            int[] priorities = new int[n];
            for (int i = 0; i < n; i++) {
                priorities[i] = Integer.parseInt(st.nextToken());
            }

            solution(n, m, priorities);

        }

        bw.flush();
        bw.close();
    }

    public static void solution(int n, int m, int[] priorities) {
        Queue<int[]> queue = new LinkedList<>();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
        Arrays.stream(priorities)
                .forEach(priorityQueue::add);

        for (int i = 0; i < n; i++) {
            queue.add(new int[]{i, priorities[i]});
        }

        int pointer = 0;
        while (!queue.isEmpty()) {
            int[] current = queue.poll();

            if (current[1] == priorityQueue.peek()) {
                pointer++;
                priorityQueue.poll();
                if (m == current[0]) {
                    System.out.println(pointer);
                }
            } else {
                queue.offer(current);
            }

        }
    }
}
