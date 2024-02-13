class Solution {
    public int search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        while(low<high)
        {
            int mid=(low+high)/2;
            if(nums[mid]<nums[high])
                high=mid;
            else
                low=mid+1;
        }
        int noofrotation=low;
        int s1=bs(nums,0,noofrotation-1,target);
        if(s1!=-1)
            return s1;
        return bs(nums,noofrotation,nums.length-1,target);
    }
    public int bs(int []arr,int low,int high,int val)
    {
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(val>arr[mid])
                low=mid+1;
            else if(val<arr[mid])
                high=mid-1;
            else
                return mid;
        }
        return -1;
    }
}