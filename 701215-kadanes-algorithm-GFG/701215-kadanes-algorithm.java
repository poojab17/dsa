class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i< arr.length; i++){
            sum += arr[i];
            
            max = Math.max(max,sum);
            if(sum < 0){
                sum = 0;
            }
        }
        return max;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna