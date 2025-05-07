import java.util.*;

class Solution {
    public int findFinalValue(int[] nums, int original) {
        List<Integer> numList = new ArrayList<>();
        for (int num : nums) {
            numList.add(num);
        }

        while (numList.contains(original)) {
            original *= 2;
        }

        return original;
    }
}
