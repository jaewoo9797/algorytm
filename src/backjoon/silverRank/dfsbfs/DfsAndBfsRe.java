package backjoon.silverRank.dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class DfsAndBfsRe {
    static ArrayList<Integer>[] array;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 정점의 개수
        int M = Integer.parseInt(st.nextToken()); // 간선의 개수
        int V = Integer.parseInt(st.nextToken());   // 시작할 정점의 번호
        array = new ArrayList[N + 1];

        for (int i = 1; i < N + 1; i++) {
            array[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            array[y].add(x);
            array[x].add(y);
        }

        for (int i = 1; i <= N; i++) {
            Collections.sort(array[i]);
        }
        boolean[] visited = new boolean[N + 1];
        dfs(V, visited);

        System.out.println();
        visited = new boolean[N + 1];
        bfs(V, visited);
    }

    private static void dfs(int v, boolean[] visited) {
        visited[v] = true;
        System.out.println(v);

        for (var i : array[v]) {
            if (!visited[i]) {
                dfs(i, visited);
            }
        }
    }

    private static void bfs(int v, boolean[] visited) {
        Queue<Integer> q = new LinkedList<>();
        q.add(v);
        visited[v] = true;

        while (!q.isEmpty()) {
            int cur = q.poll();
            System.out.println(cur);
            for (var i : array[cur]) {
                if (!visited[i]) {
                    q.add(i);
                    visited[i] = true;
                }
            }
        }

    }


}
