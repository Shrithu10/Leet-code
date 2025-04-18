
class Solution {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        int[] prefixMax = new int[n];
        int[] suffixMax = new int[n];
        
        // Compute prefix max
        prefixMax[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefixMax[i] = Math.max(prefixMax[i - 1], nums[i]);
        }

        // Compute suffix max
        suffixMax[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffixMax[i] = Math.max(suffixMax[i + 1], nums[i]);
        }

        long maxVal = 0;
        for (int j = 1; j < n - 1; j++) {
            long left = prefixMax[j - 1];
            long right = suffixMax[j + 1];
            long val = (left - nums[j]) * right;
            maxVal = Math.max(maxVal, val);
        }

        return maxVal;
    }

}
