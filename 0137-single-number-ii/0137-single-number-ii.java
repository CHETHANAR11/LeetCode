class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for (int b = 0; b < 32; b++) {
            int cnt = 0;
            for (int i = 0; i < nums.length; i++) {
                if (((nums[i] >> b) & 1) == 1) {
                    cnt++;
                }
            }
            if (cnt % 3 != 0) {
                ans = ans | (1 << b);
            }
        }
        return ans;
    }
}
