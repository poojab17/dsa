
class Solution {
    public int matrixSum(int[][] nums) {
        for(int[] row:nums){
            Arrays.sort(row);
        }
        int score = 0;
        for(int i=0;i<nums[0].length;i++){
            int max = nums[0][i];
            for(int j=1;j<nums.length;j++){
                if(max<nums[j][i]){
                    max = nums[j][i];
                }
            }
            score += max;
        }
        return score;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna