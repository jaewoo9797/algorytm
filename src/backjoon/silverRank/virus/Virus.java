package backjoon.silverRank.virus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Virus {
    // 인접 리스트로 그래프 표현
    static ArrayList<Integer>[] graph;

    // 방문 여부 배열
    static boolean[] visited;

    // 감염된 컴퓨터의 수
    static int count = 0;

    public static void dfs(int node) {
        visited[node] = true;   // 현재 노드 방문 처리
        for (int next : graph[node]) {  // 연결된 노드 탐색
            if (!visited[next]) {
                count++;  // 감염된 컴퓨터 증가
                dfs(next);
            }
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        graph = new ArrayList[n + 1];
        visited = new boolean[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph[u].add(v);
            graph[v].add(u);
        }

        dfs(1);
        System.out.println(count);

    }
}
