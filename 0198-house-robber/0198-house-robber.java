class Solution {
    public int rob(int[] nums) {
        int r = 0;
        int nor = 0;
        for (int i = 0; i < nums.length; i ++) {
            int newRob = nor + nums[i];
            int newNoRob = Math.max(nor, r);
            r = newRob;
            nor = newNoRob;
        }
        return Math.max(r, nor);
    }
}