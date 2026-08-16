class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st = new Stack<>();
        int p = 0;
        for(int i : pushed){
            st.push(i);
            while(!st.isEmpty() && st.peek() == popped[p]){
                st.pop();
                p++;
            }
        }

         return st.size() == 0;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna