package study.bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BfsGFG2 {

    public static void bfsDisconnected(List<List<Integer>> ajd) {
        boolean[] visited = new boolean[ajd.size()];

        for (int i = 0; i < ajd.size(); i++) {
            if (!visited[i]) {
                bfs(ajd, i, visited);
            }
        }
    }

    public static void bfs(List<List<Integer>> ajd, int s, boolean[] visited) {
        Queue<Integer> q = new LinkedList<Integer>();

        visited[s] = true;
        q.add(s);

        while(!q.isEmpty()) {
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

    public static void addEdge(List<List<Integer>> ajd, int u, int v) {
        ajd.get(u).add(v);
        ajd.get(v).add(u);
    }

    public static void main(String[] args) {
        int v= 6;
        List<List<Integer>> ajd = new ArrayList<>(v);

        for (int i = 0; i < v; i++) {
            ajd.add(new ArrayList<>());
        }

        addEdge(ajd, 0, 1);
        addEdge(ajd, 0, 2);
        addEdge(ajd, 3, 4);
        addEdge(ajd, 4, 5);

        bfsDisconnected(ajd);
    }
}
