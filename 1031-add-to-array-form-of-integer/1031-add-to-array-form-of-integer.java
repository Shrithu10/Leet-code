class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new ArrayList<>();
        int n = num.length;
        
        for (int i = n - 1; i >= 0 || k > 0; i--) {
            if (i >= 0) {
                k += num[i];
            }
            result.add(k % 10);
            k /= 10;
        }
        
        Collections.reverse(result);
        return result;
    }
}
