class Solution {
    public boolean isMatch(String s, String p) {
        int n = s.length();
        int m = p.length();
        char[] ss = s.toCharArray();
        char[] pp = p.toCharArray();
        boolean[][] t = new boolean[n + 1][m + 1];
        t[0][0] = true;

        for (int i = 1; i <= m; i++) {
            if (pp[i - 1] == '*') {
                t[0][i] = t[0][i - 1];
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (ss[i - 1] == pp[j - 1] || pp[j - 1] == '?') {
                    t[i][j] = t[i - 1][j - 1];
                } else if (pp[j - 1] == '*') {
                    t[i][j] = t[i - 1][j] || t[i][j - 1];
                } else {
                    t[i][j] = false;
                }
            }
        }
        
        return t[n][m];
    }
}
