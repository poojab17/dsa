class Solution {
    public static int countPairs(int arr[], int k) {
        // code here
        Arrays.sort(arr);
        
        int c = 0;
        int i = 0;
        
        for(int j = 0; j< arr.length; j++){
            while(arr[j] - arr[i] >= k){
                i++;
            }
            
            c += j - i;
        }
        return c;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna