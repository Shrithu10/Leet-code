class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] sorted = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sorted);
        Map<Integer, Integer> rank = new HashMap<>();
        for (int i = 0; i < sorted.length; i++) {
            rank.putIfAbsent(sorted[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = rank.get(nums[i]);
        }
        return nums;
    }
}