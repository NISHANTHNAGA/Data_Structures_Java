package DataStructures.Dynamic_Programming;

public class Fibmemo {
    static long fib(int x, long[] dp){
        if(x == 0 || x == 1) {
            return x;
        }
        if(dp[x]!=0)
            return dp[x];

        dp[x] = fib(x - 1, dp) + fib(x - 2, dp);
        return dp[x];
    }

    public static void main(String[] args) {
        int n = 1000;
        long[] dp = new long[n+1];
        System.out.println(fib(n,dp));
    }
}
