import java.util.Arrays;

class Solution {
    public long repairCars(int[] ranks, int cars) {
        Arrays.sort(ranks);
        long low = 1, high = (long) ranks[ranks.length - 1] * cars * cars;

        while (low < high) {
            long mid = low + (high - low) / 2;
            long totalCars = 0;

            for (int r : ranks) {
                totalCars += (long) Math.sqrt(mid / r);
                if (totalCars >= cars) break;
            }

            if (totalCars >= cars) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
}
