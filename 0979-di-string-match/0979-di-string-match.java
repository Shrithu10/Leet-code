class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int[] result = new int[n + 1];
        int low = 0, high = n;
        for (int i = 0; i < n; i++) {
            result[i] = s.charAt(i) == 'I' ? low++ : high--;
        }
        result[n] = low;
        return result;
    }
}
