class Solution {
    public boolean isMatch(String s, String p) {
        int n = s.length();
        int m = p.length();
        boolean[][] t = new boolean[n + 1][m + 1];
        t[0][0] = true;
        
        // Initialize the first row
        for (int j = 1; j <= m; j++) {
            if (p.charAt(j - 1) == '*') {
                t[0][j] = t[0][j - 2];
            }
        }

        // Build the DP table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                char currentS = s.charAt(i - 1);
                char currentP = p.charAt(j - 1);

                if (currentS == currentP || currentP == '.') {
                    t[i][j] = t[i - 1][j - 1];
                } else if (currentP == '*') {
                    t[i][j] = t[i][j - 2];
                    if (p.charAt(j - 2) == currentS || p.charAt(j - 2) == '.') {
                        t[i][j] |= t[i - 1][j];
                    }
                } else {
                    t[i][j] = false;
                }
            }
        }
        return t[n][m];
    }
}
