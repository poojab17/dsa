import java.util.*;

class Solution {
    public static ArrayList<Integer> commonElements(int a[], int b[]) {
        // code here
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        
        for(int i=0 ; i<a.length; i++) {
            map1.put(a[i], map1.getOrDefault(a[i], 0) + 1);
        }

         
        for(int i=0 ; i<b.length; i++) {
            map2.put(b[i], map2.getOrDefault(b[i], 0) + 1);
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i : map1.keySet()){
            if(map2.containsKey(i)){
                int freq = Math.min(map1.get(i), map2.get(i));
                
                for(int j = 0; j<freq; j++){
                    list.add(i);
                }
            }
        }
        Collections.sort(list);
        return list;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna