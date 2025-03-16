import java.util.Arrays;

class Solution {
    public long repairCars(int[] ranks, int cars) {
        Arrays.sort(ranks);
        long low = 1, high = (long) ranks[ranks.length - 1] * cars * cars;

        while (low < high) {
            long mid = low + (high - low) / 2;
            long t= 0;

            for (int r : ranks) {
                t += (long) Math.sqrt(mid / r);
                if (t>= cars) break;
            }

            if (t >= cars) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
}
