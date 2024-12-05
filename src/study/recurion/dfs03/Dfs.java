package study.recurion.dfs03;

public class Dfs {

    public static void main(String[] args) {
        Dfs dfs = new Dfs();
        var result = dfs.DFS(5);
        System.out.println(result);
    }

    public int DFS(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * DFS(n - 1);
        }
    }
}
