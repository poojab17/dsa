class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();
        if (k >= num.length()) {
            return "0";
        }

        for (int i = 0; i < num.length(); i++) {
            char curr = num.charAt(i);
            while (!st.isEmpty() && k > 0 && st.peek() > curr) {
                st.pop();
                k--;
            }

            st.push(curr);
        }
        while (k > 0) {
            st.pop();
            k--;
        }
        StringBuilder str = new StringBuilder();
        for (char ch : st) {
            str.append(ch);
        }

        while (str.length() > 1 && str.charAt(0) == '0') {
            str.deleteCharAt(0);
        }
        return str.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna