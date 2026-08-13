class Solution {
    int countWords(String[] list) {
        // code here
        HashMap<String,Integer> map = new HashMap<>();
        
        for(int i = 0; i<list.length; i++){
            map.put(list[i],map.getOrDefault(list[i],0)+1);
        }
        
        int c = 0;
        
        for(String i : map.keySet()){
            if(map.get(i) == 2){
                c++;
            }
        }
        return c;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna