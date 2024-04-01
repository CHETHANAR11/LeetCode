class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int count=0;
        for(int i=0;i<nums.size();i++){
            // if(nums[i]>=target)
            //     break;
            for(int j=i;j<nums.size();j++){
                if(i<j && (nums.get(i)+nums.get(j))<target){
                    count++;
                }
            }
        }
        return count;
    }
}