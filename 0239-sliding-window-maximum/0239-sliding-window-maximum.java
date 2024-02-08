class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
       PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
        return nums[b] - nums[a]; 
    });

    int n = nums.length, idx = 0;
    int[] ans = new int[n - k + 1];
    for (int i = 0; i < nums.length; i++) {
        while (pq.size() != 0 && pq.peek() <= i - k)
            pq.remove();

        pq.add(i);

        if (i >= k - 1)
            ans[idx++] = nums[pq.peek()];
    }
    return ans;
       
    }
}