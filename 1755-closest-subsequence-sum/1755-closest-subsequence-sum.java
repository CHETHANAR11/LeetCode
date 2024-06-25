class Solution {
    public int minAbsDifference(int[] nums, int goal) {
         int n = nums.length;
        if (n == 1) return Math.min(Math.abs(goal), Math.abs(nums[0] - goal));

        List<Integer> firstHalf = Sum(nums, 0, n / 2 - 1, 0);//first half
        List<Integer> secondHalf = Sum(nums, n / 2, n - 1, n / 2);//next half
        Collections.sort(secondHalf);//sort second halff

        int res = Integer.MAX_VALUE;
        for (int sum : firstHalf) {
            int lb = Collections.binarySearch(secondHalf, goal - sum);
            if (lb < 0) lb = -lb - 1;
            
            if (lb > 0) res = Math.min(res, Math.abs(goal - secondHalf.get(lb - 1) - sum));
            if (lb < secondHalf.size()) res = Math.min(res, Math.abs(goal - secondHalf.get(lb) - sum));
        }
        return res;
    }
    private List<Integer> Sum(int[] nums,int start,int end,int offset){
        List<Integer> res = new ArrayList<>();
        int n = end - start + 1;
        for (int i = 0; i < (1 << n); ++i) {
            int sum = 0;
            for (int j = 0; j < n; ++j) {
                if ((i & (1 << j)) != 0) {
                    sum += nums[j + offset];
                }
            }
            res.add(sum);
        }
        return res;

    }
}