class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0;

        int count = 0;
        int product = 1;
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            product *= nums[right];

            // Ensure the product is less than k
            while (product >= k && left <= right) {
                product /= nums[left++];
            }

            // Count subarrays ending at `right` with a product less than k
            count += right - left + 1;
        }

        return count;
    }
}
