class Solution {
    public boolean check(int[] time, int totalTrips,long mid){
        long tem = 0;

        for(int i : time){
            tem += mid / (long)i;
        }

        return tem >= totalTrips;
    }
    public long minimumTime(int[] time, int totalTrips) {
        long low = 1;
        
        long l = Integer.MAX_VALUE;

        for(int i : time){
            l = Math.min(l,i);
        }

        long high = totalTrips * l;
        long ans = 0;
        while(low <= high){
            long mid = low + (high - low)/2;

            if(check(time,totalTrips,mid)){
                ans = mid;
                high = mid -1;
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