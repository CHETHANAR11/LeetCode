class Solution {
    public boolean canJump(int[] nums) {
        int l=nums.length;
        int goal=l-1;
        
        for(int i=l-2;i>=0;i--){
            if(i+nums[i]>=goal)
                goal=i;
        }
        if(goal==0)
            return true;
        else
            return false;
    
    }
}