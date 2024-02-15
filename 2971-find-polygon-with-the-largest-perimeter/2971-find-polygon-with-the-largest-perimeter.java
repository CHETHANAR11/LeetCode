class Solution {
    public long largestPerimeter(int[] nums) {
        
        Arrays.sort(nums);
       long sum=0;
       long max=0;
        for(int i=0;i<nums.length-1; i++)
        {
            sum+=nums[i];
            if(sum>nums[i+1]){
                if(max<sum+nums[i+1])
                max=sum+nums[i+1];
            }
            
        }
//         
        if(max!=0)
            return max;
        return -1;
    }
}