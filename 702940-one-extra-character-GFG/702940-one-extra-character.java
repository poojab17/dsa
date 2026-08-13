import java.util.*;

class Solution {
    public char extraChar(String s1, String s2) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (char ch : s1.toCharArray()) {
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }

        for (char ch : s2.toCharArray()) {
            map2.put(ch, map2.getOrDefault(ch, 0) + 1);
        }

        for (char ch : map1.keySet()) {
            if (!map2.containsKey(ch) || !map1.get(ch).equals(map2.get(ch))) {
                return ch;
            }
        }

        for (char ch : map2.keySet()) {
            if (!map1.containsKey(ch)) {
                return ch;
            }
        }

        return '\0';
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna