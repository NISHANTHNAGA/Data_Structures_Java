package DataStructures.Dynamic_Programming;

public class FIbTab {
    static long fib(int x, long[] dp){
        if (x==0 || x==1){
            return x;
        }
        dp = new long[x + 1];
        dp[0] = 0;
        dp[1] = 1;

        for(int i=2; i<=x; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[x];
    }

    public static void main(String[] args) {
        int n = 1000;
        long[] dp = new long[n+1];
        System.out.println(fib(n,dp));
    }
}
