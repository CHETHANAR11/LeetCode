class Solution
{
    public int sumOddLengthSubarrays(int[] arr) 
    {
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++)
            {
                if((j-i+1)%2==1){
                    int currsum=0;
                    for(int m=i;m<j+1;m++){
                        currsum+=arr[m];
                    }
                    sum+=currsum;
                }
            }
        }
        return sum;
    }
}