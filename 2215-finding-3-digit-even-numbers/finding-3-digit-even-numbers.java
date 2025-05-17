class Solution {
    public int[] findEvenNumbers(int[] digits) {
        Set<Integer> l = new HashSet<>();
        int n = digits.length;
        for (int i = 0; i < n; i++) {
            if (digits[i] == 0) continue;
            for (int j = 0; j < n; j++) {
                if (j == i) continue;
                for (int k = 0; k < n; k++) {
                    if (k == i || k == j) continue;
                    if (digits[k] % 2 == 0)
                        l.add(digits[i] * 100 + digits[j] * 10 + digits[k]);
                }
            }
        }
        return l.stream().mapToInt(Integer::intValue).sorted().toArray();
    }
}