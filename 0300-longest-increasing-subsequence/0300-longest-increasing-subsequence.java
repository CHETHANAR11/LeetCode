class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int maxlen = 1;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], 1 + dp[j]);
                    maxlen = Math.max(maxlen, dp[i]);
                }
            }
        }
        return maxlen;
    }
}
