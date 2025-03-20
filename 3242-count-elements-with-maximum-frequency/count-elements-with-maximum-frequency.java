class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int max = Integer.MIN_VALUE;
        int c = 0;
        for (int n : nums) {
            hm.put(n, hm.getOrDefault(n, 0) + 1);
        }
        for (int value : hm.values()) {
            max = Math.max(max, value);
        }
        for (Integer key : hm.keySet()) {
            if (hm.get(key) == max)
                c = c + max;
        }
        return c;
    }
}