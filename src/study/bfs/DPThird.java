package study.bfs;

public class DPThird {

    static int fibo(int n) {
        int prevPrev, prev, curr;

        prevPrev = 0;
        prev = 1;
        curr = 1;

        for (int i = 2; i <= n; i++) {
            curr = prevPrev + prev;
            prevPrev = prev;
            prev = curr;
        }
        return curr;
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println(fibo(n));
    }
}
