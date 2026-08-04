class Solution {
    public int largestPrime(int n) {
        if(n <= 1 ) return 0;
        int sum = 0;
        int res = 0;
        for(int i = 2; i <= n;i++){
            if(isPrime(i)){
                sum += i;
                if(sum > n ) break;
                if(isPrime(sum)){
                    res = sum;
                }
            }
        }
        return res;
    }
    public static boolean isPrime(int n){
        if(n <= 1) return false;
        for(int i = 2; i * i <= n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna