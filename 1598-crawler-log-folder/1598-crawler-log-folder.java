class Solution {
    public int minOperations(String[] logs) {
        Stack<String> st = new Stack<>();

        for(int i = 0; i<logs.length; i++){
            String s = logs[i];
            if(s.equals("../")){
                if(!st.isEmpty()){
                    st.pop();
                }
            }

           else if(s.equals("./")){
            continue;
           }

            else{
           st.push(s);
            }
        }
        return st.size();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna