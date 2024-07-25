class Solution {
    public int findDuplicate(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i){
                //System.out.println("swap"+nums[i]+nums[nums[i]]);
                int temp=nums[i];
                nums[i]=nums[temp];
                nums[temp]=temp;
                i--;
                count++;
            }
            if(count==nums.length){
                break;
            }
        }
            
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i){
                return nums[i];
            }
        }
        return -1;
    }
}