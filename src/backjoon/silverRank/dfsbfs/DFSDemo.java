package backjoon.silverRank.dfsbfs;

import java.util.ArrayList;
import java.util.List;

public class DFSDemo {

    public static void main(String[] args) {
        int V = 5;

        List<List<Integer>> adj = new ArrayList<>(V);
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        int[][] edges = {
                {1, 2}, {1, 0}, {2, 0}, {2, 3}, {2, 4}
        };

        for (int[] e : edges) {
            addEdge(adj, e[0], e[1]);
        }

        int source = 1;
        System.out.println("DFS from source = " + source);
        DFS(adj, source);
    }

    private static void DFS(List<List<Integer>> adj, int start) {
        boolean[] visited = new boolean[adj.size()];

        DFSRec(adj, visited, start);
    }

    private static void DFSRec(List<List<Integer>> adj, boolean[] visited, int start) {
        visited[start] = true;

        System.out.print(start + " ");

        for (int i : adj.get(start)) {
            if (!visited[i]) {
                DFSRec(adj, visited, i);
            }
        }
    }

    private static void addEdge(List<List<Integer>> adj, int s, int t) {
        adj.get(s).add(t);
    }
}
