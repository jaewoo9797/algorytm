package study.recurion.dfs02;

public class Dfs {

    public static void main(String[] args) {
        Dfs dfs = new Dfs();
        dfs.DFS(11);
    }

    public void DFS(int n) {
        if (n == 0) {
            return;
        }
        else {
            DFS(n /2);
            System.out.print(n % 2);
        }
    }
}
