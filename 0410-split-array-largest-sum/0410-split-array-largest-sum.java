class Solution {
    public boolean check(int[] nums, int mid, int k){
        int subarr = 1;
        int sum = 0;

        for(int i: nums){
            
            
            if(sum + i <= mid){
                sum += i;
            }

            else{
                subarr++;
                sum = i;
            }
        }
      
        return subarr <= k;
    }
    public int splitArray(int[] nums, int k) {
        int low = 0;
        int high = 0;

        for(int i: nums){
              low = Math.max(low, i);
            high += i;
        }
        int ans = 0;
        while(low <= high){
          
            int mid = low + (high - low)/2;
            
            if(check(nums,mid,k)){
                ans = mid;
                high = mid - 1;
            }

            else{
                low = mid + 1;
            } 
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna