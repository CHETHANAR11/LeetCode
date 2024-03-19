class Solution {
    public int numTrees(int n) {
        int[] dp = new int[n + 1];
        return dp(n, dp);
    }

    public int dp(int n, int[] dp) {
        if (n <= 1) return 1;
        if (dp[n] != 0) return dp[n];
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            ans += dp(i - 1, dp) * dp(n - i, dp);
        }
        dp[n] = ans;
        return ans;
    }
}
