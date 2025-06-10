import java.util.*;

class Solution {
    public int maxDifference(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        
        // Count frequency of each character
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        int oc = 0; // max odd frequency
        int ec = Integer.MAX_VALUE; // min even frequency

        // Check each frequency
        for (int count : freq.values()) {
            if (count % 2 == 1) {
                oc = Math.max(oc, count);
            } else {
                ec = Math.min(ec, count);
            }
        }

        // If both odd and even frequencies exist, return the diff
        if (oc != 0 && ec != Integer.MAX_VALUE) {
            return oc - ec;
        }
        
        return 0;
    }
}
