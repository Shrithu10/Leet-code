class Solution {
    public int triangularSum(int[] nums) {
        // Convert the array to an ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }

        while (list.size() > 1) {
            for (int i = 0; i < list.size() - 1; i++) {
                list.set(i, (list.get(i) + list.get(i + 1)) % 10); }
            list.remove(list.size() - 1);
        }

        return list.get(0);
    }
}
