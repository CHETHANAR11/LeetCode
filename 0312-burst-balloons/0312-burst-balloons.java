class Solution {
    public int maxCoins(int[] nums) {
        int n = nums.length;
        int[] newNums = new int[n + 2];
        newNums[0] = 1;
        newNums[n + 1] = 1;
        for (int i = 0; i < n; i++) {
            newNums[i + 1] = nums[i];
        }
        int[][] dp = new int[n + 2][n + 2];
        return dfs(newNums, dp, 1, n);
    }
    
    private int dfs(int[] nums, int[][] dp, int l, int r) {
        if (l > r) {
            return 0;
        }
        
        if (dp[l][r] != 0) {
            return dp[l][r];
        }
        
        for (int i = l; i <= r; i++) {
            int coins = nums[l - 1] * nums[i] * nums[r + 1];
            coins += dfs(nums, dp, l, i - 1) + dfs(nums, dp, i + 1, r);
            dp[l][r] = Math.max(dp[l][r], coins);
        }
        
        return dp[l][r];
    }
}
