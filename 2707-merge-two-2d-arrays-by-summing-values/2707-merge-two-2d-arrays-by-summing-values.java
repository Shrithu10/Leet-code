import java.util.*;

class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        Map<Integer, Integer> hm = new HashMap<>();

        for (int[] pair : nums1) {
            hm.put(pair[0], hm.getOrDefault(pair[0], 0) + pair[1]);
        }

        for (int[] pair : nums2) {
            hm.put(pair[0], hm.getOrDefault(pair[0], 0) + pair[1]);
        }

        List<Integer> keys = new ArrayList<>(hm.keySet());
        Collections.sort(keys);
        
        int[][] result = new int[keys.size()][2];
        for (int i = 0; i < keys.size(); i++) {
            result[i][0] = keys.get(i);
            result[i][1] = hm.get(keys.get(i));
        }

        return result;
    }
}
