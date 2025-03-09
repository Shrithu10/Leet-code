import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int triangularSum(int[] nums) {
        // Convert the array to an ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }

        // Keep reducing the list by summing adjacent elements
        while (list.size() > 1) {
            // Iterate through the list and update values in place
            for (int i = 0; i < list.size() - 1; i++) {
                list.set(i, (list.get(i) + list.get(i + 1)) % 10); // Update element at i
            }
            // Remove the last element
            list.remove(list.size() - 1);
        }

        // Only one element remains, return it
        return list.get(0);
    }
}
