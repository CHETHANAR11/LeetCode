class Solution {
    public String removeKdigits(String num, int k) {
        int l = num.length();
        if (k == l) {
            return "0"; // If we remove all digits, the result is "0".
        }

        Stack<Character> stack = new Stack<>();

        for (char c : num.toCharArray()) {
            // Remove elements from the stack if they are greater than the current character
            // and we still have digits to remove (k > 0).
            while (!stack.isEmpty() && k > 0 && stack.peek() > c) {
                stack.pop();
                k--;
            }
            stack.push(c);
        }

        // Remove remaining digits if k > 0
        while (k > 0 && !stack.isEmpty()) {
            stack.pop();
            k--;
        }

        // Build the result string from the stack
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        // Reverse the string because the stack gives the result in reverse order
        String result = sb.reverse().toString();

        // Remove leading zeros
        result = result.replaceFirst("^0+", "");

        // Return "0" if the result is empty
        return result.isEmpty() ? "0" : result;
    }
}
