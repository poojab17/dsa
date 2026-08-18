class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder ans = new StringBuilder();
        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);

            if(ch == ')'){
                StringBuilder str = new StringBuilder();
                while(!st.isEmpty() && st.peek() != '('){
                    str.append(st.pop());
                }

                st.pop();
                String temp = str.toString();
                for(char c : temp.toCharArray()){
                    st.push(c);
                }
            }

            else{
                st.push(ch);
            }
        }
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        return ans.reverse().toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna