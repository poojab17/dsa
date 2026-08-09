class SpecialStack {
    Stack<Integer> st;
    Stack<Integer> maxSt;
    public SpecialStack() {
        // Define Stack
        st = new Stack<>();
        maxSt = new Stack<>();
    }

    public void push(int x) {
        // Add an element to the top of Stack
        st.push(x);
        
        if(maxSt.isEmpty() || x>= maxSt.peek()){
            maxSt.push(x);
        }
    }

    public void pop() {
        // Remove the top element from the Stack
        if(st.isEmpty()) return;
        
        int val = st.pop();
        
        if(maxSt.peek().equals(val)){
            maxSt.pop();
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

    public int getMax() {
        // Finds maximum element of Stack
        if(maxSt.isEmpty()) return -1;
        
        return maxSt.peek();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna