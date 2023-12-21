class Solution {
    public boolean increasingTriplet(int[] nums) {
           int s = Integer.MAX_VALUE;
        int m = Integer.MAX_VALUE;


        for(int big : nums) {
            if(big <= s) {
                s = big;
            }
            else if(big <= m) {
                m = big;
            }
            else return true;
        }
        return false;
    }
}