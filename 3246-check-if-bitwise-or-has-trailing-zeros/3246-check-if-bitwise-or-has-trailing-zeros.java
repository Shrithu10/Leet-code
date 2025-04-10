class Solution {
    public boolean hasTrailingZeros(int[] nums) {
        int c = 0;
        for (int num : nums) {
            if ((num & 1) == 0) { 
                c++;
                if (c>= 2) return true;
            }
        }
        return false;
    }
}
