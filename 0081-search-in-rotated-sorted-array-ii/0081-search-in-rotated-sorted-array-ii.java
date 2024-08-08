class Solution {
    public boolean search(int[] nums, int target) {
        int i = 0, j = nums.length - 1;
        
        while (i <= j) {
            int mid = (i + j) / 2;
            
            if (nums[i] == target || nums[j] == target || nums[mid] == target) {
                return true;
            }
            
            if (nums[i] < nums[mid]) {
                if (target > nums[i] && target < nums[mid]) {
                    j = mid - 1;
                } else {
                    i = mid + 1;
                }
            } 
            else if (nums[mid] < nums[j]) {
                if (target > nums[mid] && target < nums[j]) {
                    i = mid + 1;
                } else {
                    j = mid - 1;
                }
            } 
            else {
                i++;
            }
        }
        
        return false;
    }
}
