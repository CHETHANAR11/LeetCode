import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> para = new ArrayList<>();
        help(para, new StringBuilder(), n, 0, 0);
        return para;
    }

    public void help(List<String> li, StringBuilder s, int n, int open, int close) {
        if (s.length() == 2 * n) {
            li.add(s.toString());
            return;
        }

        if (open < n) {
            s.append('(');
            help(li, s, n, open + 1, close);
            s.deleteCharAt(s.length() - 1);  // Backtrack
        }

        if (close < open) {
            s.append(')');
            help(li, s, n, open, close + 1);
            s.deleteCharAt(s.length() - 1);  // Backtrack
        }
    }
}
