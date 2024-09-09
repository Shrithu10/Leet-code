import java.util.*;

class Solution {
    public int distinctAverages(int[] nums) {
        List<Integer> a = Arrays.stream(nums).boxed().collect(Collectors.toList());
        Set<Double> avg = new HashSet<>();

        Collections.sort(a);
        while (a.size() > 0) {
            double average = (a.get(a.size() - 1) + a.get(0)) / 2.0;
            avg.add(average);
            a.remove(a.size() - 1); // Remove max element
            a.remove(0); // Remove min element
        }
        
        return avg.size();
    }
}
