class Solution {
    public String makeGood(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (!st.isEmpty() && Math.abs(st.peek() - ch) == 32) {
                st.pop();
            } else {
                st.push(ch);
            }
        }

        StringBuilder str = new StringBuilder();

        while (!st.isEmpty()) {
            str.append(st.pop());
        }

        return str.reverse().toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna