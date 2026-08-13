class Solution {
    public char repeatedCharacter(String s) {
        HashSet<Character> hs = new HashSet<>();
        for(char c:s.toCharArray())
        {
            if(!hs.contains(c))
            {
                hs.add(c);
            }
            else
            {
                return c;
            }
        }
        return 'a';
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna