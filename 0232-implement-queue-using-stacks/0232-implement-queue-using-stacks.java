class MyQueue {
    Stack<Integer> st;
    Stack<Integer> helperSt;
    public MyQueue() {
        st = new Stack<>();
        helperSt = new Stack<>();
    }
    
    public void push(int x) {
        st.push(x);
    }
    
    public int pop() {
        if(helperSt.isEmpty()){
            while(!st.isEmpty()){
                helperSt.push(st.pop());
            }
        }
        return helperSt.pop();
    }
    
    public int peek() {
         if(helperSt.isEmpty()){
            while(!st.isEmpty()){
                helperSt.push(st.pop());
            }
        }
        if(helperSt.isEmpty()) return -1;

        return helperSt.peek();
    }
    
    public boolean empty() {
        return st.isEmpty() && helperSt.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna