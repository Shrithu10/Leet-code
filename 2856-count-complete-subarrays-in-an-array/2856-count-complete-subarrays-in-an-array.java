import java.util.*;

class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int total = 0;
        Set<Integer> unique = new HashSet<>();
        for (int num : nums) unique.add(num);
        int k = unique.size();

        for (int i = 0; i < nums.length; i++) {
            Set<Integer> seen = new HashSet<>();
            for (int j = i; j < nums.length; j++) {
                seen.add(nums[j]);
                if (seen.size() == k) total++;
            }
        }

        return total;
    }
}
