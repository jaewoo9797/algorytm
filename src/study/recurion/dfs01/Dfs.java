package study.recurion.dfs01;

public class Dfs {

    public static void main(String[] args) {
        DFS(3);
    }

    public static void DFS(int n) {
        if (n < 0) {
            return;
        }
        else {
            DFS(n - 1);
            System.out.print(n + " ");
        }
    }
}
