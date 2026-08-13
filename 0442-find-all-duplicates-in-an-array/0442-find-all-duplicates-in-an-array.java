class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        ArrayList<Integer> list = new ArrayList<>();

        for(int i : nums){
            map.put(i, map.getOrDefault(i,0)+1);

             if(map.get(i) > 1){
                list.add(i);
            }
        }

        return list;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna