class Solution {
    public int jump(int[] nums) {
        int res=0;int l=0,r=0;
        
        while(r<nums.length-1){
            int f=0;
            for(int i=l;i<=r;i++){
                f=Math.max(f,i+nums[i]);
            }
            l=r+1;
            r=f;
            res+=1;
        }
        return res;
    }
}