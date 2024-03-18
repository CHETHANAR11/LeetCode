class Solution {
    public String longestPalindrome(String str) {
        if (str == null || str.length() == 0) return "";
        String res = str.substring(0, 1);
        int len = 1;
        char[] st = str.toCharArray();
        for (int i = 0; i < st.length; i++) {
            int l = i, r = i;
            while (l >= 0 && r < st.length && st[l] == st[r]) {
                if (r - l + 1 > len) {
                    res = str.substring(l, r + 1);
                    len = r - l + 1;
                }
                l--;
                r++;
            }
            l = i;
            r = i + 1;
            while (l >= 0 && r < st.length && st[l] == st[r]) {
                if (r - l + 1 > len) {
                    res = str.substring(l, r + 1);
                    len = r - l + 1;
                }
                l--;
                r++;
            }
        }
        return res;
    }
}
