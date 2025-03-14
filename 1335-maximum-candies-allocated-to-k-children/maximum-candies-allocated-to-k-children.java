class Solution {
    public int maximumCandies(int[] candies, long k) {
        long totalCandies = 0;
        for (int candy : candies) {
            totalCandies += candy;
        }
        if (totalCandies < k) return 0;
        int left = 1, right = (int) 1e7, result = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long count = 0;

            for (int candy : candies) {
                count += candy / mid;
            }

            if (count >= k) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }
}
