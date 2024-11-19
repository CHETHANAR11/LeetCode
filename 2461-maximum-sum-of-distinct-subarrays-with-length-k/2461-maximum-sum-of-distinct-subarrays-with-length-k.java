class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int l = nums.length;
        long max = 0;
        long sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int start = 0;
        for (int end = 0; end < l; end++) {
            sum += nums[end];
            map.put(nums[end], map.getOrDefault(nums[end], 0) + 1);
            if (end - start + 1 > k) {
                sum -= nums[start];
                map.put(nums[start], map.get(nums[start]) - 1);
                if (map.get(nums[start]) == 0) {
                    map.remove(nums[start]);
                }
                start++;
            }
            if (end - start + 1 == k && map.size() == k) {
                max = Math.max(max, sum);
            }
        }

        return max;
    }
}
