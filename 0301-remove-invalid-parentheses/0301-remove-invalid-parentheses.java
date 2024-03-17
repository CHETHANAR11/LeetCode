class Solution {
    List<String> res;
    Map<String, Integer> mp;

    public Solution() {
        res = new ArrayList<>();
        mp = new HashMap<>();
    }

    public List<String> removeInvalidParentheses(String s) {
        solve(s, getMinInValid(s));
        return res;
    }

    private int getMinInValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push('(');
            } else if (c == ')') {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    stack.push(')');
                }
            }
        }
        return stack.size();
    }

    private void solve(String s, int minInv) {
        if (mp.containsKey(s)) return;
        else mp.put(s, 1);

        // Base case
        if (minInv < 0) return;
        if (minInv == 0) {
            if (getMinInValid(s) == 0)
                res.add(s);
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            String left = s.substring(0, i);
            String right = s.substring(i + 1);
            solve(left + right, minInv - 1);
        }
    }
}
