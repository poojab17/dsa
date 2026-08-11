class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {

        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> st = new Stack<>();

        int n = arr.length;
        int[] ans = new int[n];

        for(int i = n - 1; i >= 0; i--) {

            while(!st.isEmpty() && arr[i] >= st.peek()) {
                st.pop();
            }

            if(!st.isEmpty()) {
                ans[i] = st.peek();
            } else {
                ans[i] = -1;
            }

            st.push(arr[i]);
        }

        for(int i = 0; i < n; i++) {
            list.add(ans[i]);
        }

        return list;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna