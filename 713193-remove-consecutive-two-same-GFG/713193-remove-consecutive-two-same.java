class Solution {
    public String removePair(String s) {
        // code here
        Stack<Character> st = new Stack<>();
        
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(!st.isEmpty() && st.peek() ==ch){
                st.pop();
            }
            
            else{
                st.push(ch);
            }
        }
            
            if(st.isEmpty()){
                return "-1";
            }
            
            StringBuilder str = new StringBuilder();
            while(!st.isEmpty()){
                str.append(st.pop());
            }
            
            return str.reverse().toString();
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna