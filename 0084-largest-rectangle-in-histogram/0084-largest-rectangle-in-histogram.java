class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> st = new Stack<>();
        int[] start = new int[n];
        int[] end = new int[n];

        for(int i = 0; i<n; i++){
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]){
                st.pop();
            }

            start[i] = st.isEmpty() ? 0 : st.peek() + 1; 

            st.push(i);
        }
        st.clear(); //imp
        for(int i = n-1; i>=0; i--){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            end[i] = st.isEmpty() ? n-1 : st.peek() - 1;

            st.push(i);
        }

        int maxArea = 0;
        for(int i=0; i<n; i++){
            int width = end[i] - start[i] + 1;
            int area = width * heights[i];
            maxArea = Math.max(area,maxArea);
        }

        return maxArea;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna