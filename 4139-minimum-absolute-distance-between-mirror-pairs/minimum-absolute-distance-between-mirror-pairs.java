class Solution {
    public int minMirrorPairDistance(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int minDist = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int rev = rev(nums[i]);

            if (map.containsKey(nums[i])) {
                int j = map.get(nums[i]);
                minDist = Math.min(minDist, i - j);
            }

            map.put(rev, i);
        }

        return minDist == Integer.MAX_VALUE ? -1 : minDist;
    }

    static int rev(int n) {
        int re = 0;
        while (n != 0) {
            re = re * 10 + (n % 10);
            n /= 10;
        }
        return re;
    }
}