class Solution {
    Boolean[][] dp;

    public boolean canPartition(int[] nums) {
        int sum = 0;
        int n = nums.length;

        for (int i : nums) {
            sum += i;
        }

        if (sum % 2 == 1) {
            return false;
        }

        int targetSum = sum / 2;
        dp = new Boolean[n][targetSum + 1];

        return res(nums, n - 1, targetSum);
    }

    public boolean res(int[] nums, int pos, int target) {
        if (target == 0) {
            return true;
        }
        if (pos < 0 || target < 0) {
            return false;
        }
        if (dp[pos][target] != null) {
            return dp[pos][target];
        }

        boolean include = res(nums, pos - 1, target - nums[pos]);
        boolean exclude = res(nums, pos - 1, target);

        dp[pos][target] = include || exclude;
        return dp[pos][target];
    }
}
