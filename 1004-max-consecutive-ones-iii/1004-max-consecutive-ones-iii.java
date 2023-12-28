class Solution {
    public int longestOnes(int[] nums, int k) {
        // int count=0;
        // int max=0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]=='1')
        //         count++;
        //     else{
        //         count+=k;
        //         if(count>max)
        //             max=count;
        //     }
        //     count=0;
        // }
        // return max;
        
        int i = 0, j;
        for (j = 0; j < nums.length; ++j) {
            if (nums[j] == 0)
                k--;
            if (k < 0 && nums[i++] == 0)
                k++;
        }
        return j-i;

    }
}