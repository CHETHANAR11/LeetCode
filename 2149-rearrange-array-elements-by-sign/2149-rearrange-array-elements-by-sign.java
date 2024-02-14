class Solution {
    public int[] rearrangeArray(int[] nums) {
        Queue<Integer> queue1 = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                queue1.offer(nums[i]);
            }
            if(nums[i]<0){
                queue2.offer(nums[i]);
            }
        }
        int[] arr=new int[nums.length];
        arr[0]=queue1.poll();
        for(int i=1;i<nums.length;i++){
            if(i%2==0){
               arr[i]= queue1.poll();
            }
            else{
                arr[i] =queue2.poll();
            }
        }
        return arr;
    }
}