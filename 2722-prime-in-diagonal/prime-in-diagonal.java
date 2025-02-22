class Solution {
    public int diagonalPrime(int[][] nums) {
        int c = nums[0].length - 1;
        int max = 0; 
        for (int i = 0; i < nums.length; i++) {
            if (isprime(nums[i][c])) {
                max = Math.max(max, nums[i][c]);
            }
            c = c - 1;
        }
        int d = 0;
        for (int i = 0; i < nums.length; i++) {
            if (isprime(nums[i][d])) {
                max = Math.max(max, nums[i][d]);
            }
            d = d + 1;
        }
        return max;
    }

    static boolean isprime(int n) {
                if (n <= 1) {
            return false;
                }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
