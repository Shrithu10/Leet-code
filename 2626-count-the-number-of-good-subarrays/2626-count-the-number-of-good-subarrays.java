class Solution {
    public long countGood(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        int n = nums.length;
        long res = 0, pairs = 0;
        int left = 0;

        for (int right = 0; right < n; right++) {
            int count = freq.getOrDefault(nums[right], 0);
            pairs += count;
            freq.put(nums[right], count + 1);

            while (pairs >= k) {
                res += n - right;
                int leftCount = freq.get(nums[left]);
                pairs -= leftCount - 1;
                freq.put(nums[left], leftCount - 1);
                left++;
            }
        }

        return res;
    }
}
