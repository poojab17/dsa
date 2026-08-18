class Solution {
    public String decodeString(String s) {
        Stack<Integer> stn = new Stack<>();
        Stack<Character> stc = new Stack<>();
        StringBuilder ans = new StringBuilder();
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            }

            else if (ch == '[') {
                stn.push(num);
                num = 0;
                stc.push(ch);
            }

            else if (ch == ']') {
                StringBuilder str = new StringBuilder();
                while (!stc.isEmpty() && stc.peek() != '[') {
                    str.append(stc.pop());
                }
                stc.pop();
                str.reverse();

                int repeat = stn.pop();
                String temp = str.toString();
                for (int j = 0; j < repeat; j++) {
                    for (char c : temp.toCharArray()) {
                        stc.push(c);
                    }

                }
            }

            else {
                stc.push(ch);
            }
        }
        while (!stc.isEmpty()) {
                ans.append(stc.pop());
            }
        return ans.reverse().toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna