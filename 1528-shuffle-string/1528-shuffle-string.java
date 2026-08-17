class Solution {
    public String restoreString(String s, int[] indices) {
        char[] res = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            res[indices[i]] = s.charAt(i);
        }

        return new String(res);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna