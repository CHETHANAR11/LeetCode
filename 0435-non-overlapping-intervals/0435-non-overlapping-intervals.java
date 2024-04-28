class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int len = intervals.length;
        if (len <= 1) {
            return 0; // No overlaps if there are 0 or 1 intervals
        }
        
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int res = 0;
        int prevEnd = intervals[0][1];
        
        for (int i = 1; i < len; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];
            
            if (start >= prevEnd) {
                prevEnd = end;
            } else {
                res++;
                prevEnd = Math.min(end, prevEnd);
            }
        }
        
        return res;
    }
}
