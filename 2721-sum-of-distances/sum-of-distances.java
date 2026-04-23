import java.util.*;

class Solution {
    public long[] distance(int[] nums) {
        int n = nums.length;
        long[] res = new long[n];
        
        Map<Integer, List<Integer>> map = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }
        
        for (List<Integer> list : map.values()) {
            int size = list.size();
            long total = 0;
            
            for (int x : list) total += x;
            
            long prefix = 0;
            
            for (int k = 0; k < size; k++) {
                int i = list.get(k);
                
                long left = (long)i * k - prefix;
                long right = (total - prefix - i) - (long)i * (size - k - 1);
                
                res[i] = left + right;
                
                prefix += i;
            }
        }
        
        return res;
    }
}