class Solution {
    public int minOperations(int[] nums) {
        int d = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                int difference = nums[i - 1] - nums[i] + 1;
                nums[i] += difference;
                d += difference;
            }
        }
        return d;
    }
}
