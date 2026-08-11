class Solution {
    public static ArrayList<Integer> prevSmaller(int[] arr) {
        // code here
        int n = arr.length;
        int[] res = new int[n];
        
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        
        for(int i=0; i< n; i++){
            while(!st.isEmpty() && st.peek() >= arr[i]){
                st.pop();
            }
            
            if(!st.isEmpty()){
                res[i] = st.peek();
            }
            
            else{
                res[i] = -1;
            }
            
            st.push(arr[i]);
        }
        
        for(int i : res){
            list.add(i);
        }
        return list;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna