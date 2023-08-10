class Solution {
    public int fib(int n) {
         if (n <= 1) {
            return n;
        }

        int i = 0;
        int j = 1;

        for (int m = 2; m <= n; m++) {
            int temp = j;
            j = i + j;
            i = temp;
        }

        return j;
    }
}