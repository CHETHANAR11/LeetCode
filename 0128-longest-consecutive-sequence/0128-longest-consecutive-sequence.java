class Solution {
    public int longestConsecutive(int[] nums) {
       if (nums == null || nums.length == 0) {
            return 0;
        }
        
        HashMap<Integer, Boolean> hm = new HashMap<>();
        for (int num : nums) {
            hm.put(num, false);
        }

        int maxLen = 0;
        for (int num : nums) {
            if (hm.get(num)) {
                continue; // Skip if already visited
            }
            int len = 1;
            // Check consecutive elements greater than num
            for (int i = num + 1; hm.containsKey(i); i++) {
                len++;
                hm.put(i, true); // Mark visited
            }
            // Check consecutive elements less than num
            for (int i = num - 1; hm.containsKey(i); i--) {
                len++;
                hm.put(i, true); // Mark visited
            }
            maxLen = Math.max(maxLen, len);
        }
        return maxLen;
    }
}