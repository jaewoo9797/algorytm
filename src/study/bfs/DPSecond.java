package study.bfs;

public class DPSecond {

    private static long fibo(int n) {
        long[] dp = new long[n+1];
        
        dp[0] = 0;
        dp[1] = 1;
        
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
    
    public static void main(String[] args) {
        int n = 5;
        System.out.println("fibo(n) = " + fibo(n));
    }
}
