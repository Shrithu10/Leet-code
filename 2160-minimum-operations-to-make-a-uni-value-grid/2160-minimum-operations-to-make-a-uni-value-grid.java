class Solution {
    public int minOperations(int[][] grid, int x) {
        int m = grid.length, n = grid[0].length;
        int[] nums = new int[m * n];
        int index = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                nums[index++] = grid[i][j];
            }
        }

        int remainder = nums[0] % x;
        for (int num : nums) {
            if (num % x != remainder) {
                return -1;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = Math.abs(nums[i] - remainder);
        }

        Arrays.sort(nums);

        int median = nums[nums.length / 2];
        int operations = 0;
        for (int num : nums) {
            operations += Math.abs(num - median) / x;
        }

        return operations;
    }
}
