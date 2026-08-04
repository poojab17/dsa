class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        int c = 0;
        for(int i : arr){
            if(i == target){
                c++;
            }
        }
        return c;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna