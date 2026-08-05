class Solution {
    public boolean isPalindrome(String str, int s, int e){
        while(s<=e){
            if(str.charAt(e) == str.charAt(s)){
                s++;
                e--;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public boolean validPalindrome(String str) {
        int s = 0, e = str.length()-1;

        while(s < e){
            if(str.charAt(e) == str.charAt(s)){
                s++;
                e--;
            }

            else{
                return isPalindrome(str,s+1,e) || isPalindrome(str,s,e-1);
            }
        }

        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna