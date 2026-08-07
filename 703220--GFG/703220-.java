
class Solution {
    static String longestPalindrome(String s) {
        // code here
         int n = s.length();

        int maxLen = 1, start = 0;

       
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                if (helper(i, j, s) == true && (j - i + 1) > maxLen) {
                    start = i;
                    maxLen = j - i + 1;
                }
            }
        }
        return s.substring(start, start + maxLen);
    }
    
    static boolean helper(int start, int end ,String s){
       
        while(start<=end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna