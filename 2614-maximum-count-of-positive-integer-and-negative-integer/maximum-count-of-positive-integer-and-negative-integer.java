class Solution {
    public int maximumCount(int[] nums) {
        int negCount = findFirstNonNegative(nums);
        int posCount = nums.length - findFirstPositive(nums);
        return Math.max(negCount, posCount);
    }

    private int findFirstNonNegative(int[] nums) {
        int l = 0, r = nums.length;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] < 0) 
                l = mid + 1;
            else 
                r = mid;
        }
        return l;
    }

    private int findFirstPositive(int[] nums) {
        int l = 0, r = nums.length;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] <= 0) 
                l = mid + 1;
            else 
                r = mid;
        }
        return l;
    }
}
