class Solution {
    public int maxProduct(int[] nums) {
        int res = nums[0];
        int curMin = nums[0];
        int curMax = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == 0) {
                curMin = 1;
                curMax = 1;
                res = Math.max(res, 0); 
                continue;
            }
            
            int tmpMax = curMax; 
            curMax = Math.max(nums[i], Math.max(curMax * nums[i], curMin * nums[i]));
            curMin = Math.min(nums[i], Math.min(tmpMax * nums[i], curMin * nums[i]));
            
            res = Math.max(res, curMax);
        }
        
        return res;
    }
}
