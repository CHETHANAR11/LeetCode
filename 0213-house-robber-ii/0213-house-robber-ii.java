class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0]; 
        int a = helper(nums, 0, nums.length - 2); 
        int b = helper(nums, 1, nums.length - 1); 
        return Math.max(a, b);
    }
    public int helper(int[] nums,int start, int end){
         int prev1 = 0; // Maximum value when considering the previous house
        int prev2 = 0; // Maximum value when considering the house before the previous house
        for (int i = start; i <= end; i++) {
            int current = Math.max(prev2 + nums[i], prev1); // Maximum value when considering the current house
            prev2 = prev1; // Update previous values
            prev1 = current;
        }
        return prev1; 
    }
}