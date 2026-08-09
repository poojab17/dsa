class SpecialStack {
    Stack<Integer> st;
    Stack<Integer> minSt;
    
    public SpecialStack() {
        // Define Stack
        st = new Stack<>();
         minSt = new Stack<>();

}

    public void push(int x) {
        // Add an element to the top of Stack
        st.push(x);
        
        // x<= min
        if(minSt.isEmpty() || x <= minSt.peek()){
            minSt.push(x);
        }
    }

    public void pop() {
        // Remove the top element from the Stack
        if(st.isEmpty()) return;
        int val = st.pop();
        
        //Because Integer objects are being compared using ==, this can be unsafe for arbitrary integers.
        if(minSt.peek().equals(val)){
            minSt.pop();
        }
    }

    public int peek() {
        // Returns top element of the Stack
        if(st.isEmpty()) return -1;
        return st.peek();
    }

    boolean isEmpty() {
        // Check if the stack is empty
       return st.isEmpty();
    }

    public int getMin() {
        // Finds minimum element of Stack
        if(minSt.isEmpty()){
            return -1;
        }
        return minSt.peek();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna