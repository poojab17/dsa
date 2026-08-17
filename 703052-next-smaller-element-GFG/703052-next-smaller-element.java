class Solution {
    static ArrayList<Integer> nextSmallerEle(int[] arr) {
        // code here
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
     ArrayList<Integer> res = new ArrayList<>();
        for(int i = n-1; i>=0; i--){
            while(!st.isEmpty() && st.peek() >= arr[i]){
                st.pop();
            }
            
            if (!st.isEmpty()){
                res.add(st.peek());
            }
            
            else{
                res.add(-1);
            }
            st.push(arr[i]);
        }
        Collections.reverse(res);
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna