class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=1,t=0,miss=0;
        int[] ar=new int[(nums.length+1)];
        Arrays.fill(ar,0);
        for(int i=0;i<nums.length;i++){
            ar[nums[i]]++;
        }
        for(int i=1;i<=nums.length;i++){
            if(ar[i]==0)
                miss=i;
            else if(ar[i]==2)
                t=i;
        }
        int[] arr=new int[2];
        arr[0]=t;
        arr[1]=miss;
        return arr;
    }
}

