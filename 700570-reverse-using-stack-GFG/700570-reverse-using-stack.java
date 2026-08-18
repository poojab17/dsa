class Solution {
    public String reverse(String S) {
        // code here
        Stack<Character> st = new Stack<>();
        
        for(int i=0;i<S.length();i++){
            char ch = S.charAt(i);
            
            st.push(ch);
        }
        
        StringBuilder str = new StringBuilder();
        while(!st.isEmpty()){
            str.append(st.pop());
        }
        
        return str.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna