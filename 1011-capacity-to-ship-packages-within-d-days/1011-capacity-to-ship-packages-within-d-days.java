class Solution {
    public int shipWithinDays(int[] weights, int days) {
         int n = weights.length;
        int upper = 0;
        int lower = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            lower = Math.max(lower, weights[i]);
            upper += weights[i];
        }
        int res = upper;
        while (lower <= upper) {
            int capacity = (lower + upper) / 2;
            if (canShip(weights, days, capacity)) {
                res = capacity;
                upper = capacity - 1;
            } else {
                lower = capacity + 1;
            }
        }
        return res;
    }

    public static boolean canShip(int[] weights, int days, int capacity) {
        int ships = 1, curr = 0;
        for (int w : weights) {
            if (curr + w > capacity) {
                ships++;
                curr = 0;
            }
            curr += w;
        }
        return ships <= days;
    }
}