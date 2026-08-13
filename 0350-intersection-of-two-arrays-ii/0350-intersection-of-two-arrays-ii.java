import java.util.*;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i : nums1) {
            map1.put(i, map1.getOrDefault(i, 0) + 1);
        }

        for (int i : nums2) {
            map2.put(i, map2.getOrDefault(i, 0) + 1);
        }

        for (int key : map1.keySet()) {
            if (map2.containsKey(key)) {
                int freq = Math.min(map1.get(key), map2.get(key));

                for (int i = 0; i < freq; i++) {
                    list.add(key);
                }
            }
        }

        int[] ans = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna