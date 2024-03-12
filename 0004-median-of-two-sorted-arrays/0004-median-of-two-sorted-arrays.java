class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1=nums1.length;
        int l2=nums2.length;
        int[] arr=new int[l1+l2];
        int l3=arr.length;
        int j=0;
        for(int i : nums1){
            arr[j]=i;
            j++;
        }
        for(int i : nums2){
            arr[j]=i;
            j++;
        }
        Arrays.sort(arr);
      for (int i=0;i<l3;i++){  System.out.println(arr[i]);}
        if (l3 % 2 == 0) {
    int mid = l3 / 2;
    int pre = mid - 1;
    float ans = (arr[mid] + arr[pre]) / 2.0f;
    return ans;
}

        else{
            int mid=l3/2;
            float ans= arr[mid];
            return ans;
        }
    }
}