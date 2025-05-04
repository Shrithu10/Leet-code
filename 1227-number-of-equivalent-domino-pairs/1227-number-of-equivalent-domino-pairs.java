class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        Map<String, Integer> hm = new HashMap<>();

        for (int[] d : dominoes) {
            Arrays.sort(d);
            String key = d[0] + "," + d[1];
            hm.put(key, hm.getOrDefault(key, 0) + 1);
        }

        int r = 0;
        for (int count : hm.values()) {
            if (count > 1) {
                r += (count * (count - 1)) / 2;
            }
        }

        return r;
    }
}
