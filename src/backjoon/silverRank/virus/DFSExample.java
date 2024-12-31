package backjoon.silverRank.virus;

import java.util.ArrayList;
import java.util.Scanner;

public class DFSExample {

    static ArrayList<Integer>[] graph;
    static boolean[] visited;

    public static void dfs(int node) {
        visited[node] = true;
        System.out.printf("now Visited node is : %d", node);

        for (int next : graph[node]) {
            if (!visited[next]) {
                dfs(next);
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 정점의 개수
        int m = sc.nextInt(); // 간선의 개수

        graph = new ArrayList[n + 1]; // 정점 번호가 1부터 시작한다고 가정
        visited = new boolean[n + 1]; // 방문 여부 배열 초기화

        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>(); // 각 정점의 리스트 초기화
        }

        // 간선 입력
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph[u].add(v); // u -> v 연결
            graph[v].add(u); // v -> u 연결 (무방향 그래프)
        }

        dfs(1); // 1번 노드에서 시작
    }
}
