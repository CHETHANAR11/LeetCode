class Solution {
    public void rotate(int[] nums, int k) {
        int l=nums.length;
       int[] arr = new int[l];
        for (int i = 0; i < l; i++) {
            arr[(i + k) % l] = nums[i];
            System.out.print(arr[i]);
        }
          for (int i = 0; i < l; i++) {
            nums[i] = arr[i];
        }
    }
}