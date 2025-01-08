package study.bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BfsGFG1 {

    static void bfs(List<List<Integer>> ajd, int s) {

        // Create a queue for BFS
        Queue<Integer> q = new LinkedList<>();

        // 방문 여부를 위한 배열
        boolean[] visited = new boolean[ajd.size()];

        // Mark noed as visited and enqueue it
        visited[s] = true;
        q.add(s);

        // Iterate over the queue
        while (!q.isEmpty()) {

            // Dequeue a vertex and print it
            int curr = q.poll();
            System.out.println("curr = " + curr);

            for (int x : ajd.get(curr)) {
                if (!visited[x]) {
                    visited[x] = true;
                    q.add(x);
                }
            }
        }
    }

    static void addEdge(List<List<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }


    public static void main(String[] args) {
        int V = 5;

        List<List<Integer>> adj = new ArrayList<>(V);
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 1, 4);
        addEdge(adj, 2, 4);

        System.out.println("BFS starting from 0 : ");
        bfs(adj, 0);
    }
}
