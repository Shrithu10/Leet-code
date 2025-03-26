class Solution {
    public int minOperations(int[][] grid, int x) {
        int m = grid.length, n = grid[0].length;
        int[] nums = new int[m * n];
        int index = 0;

        // Flatten the grid into a 1D array
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                nums[index++] = grid[i][j];
            }
        }

        // Check if all elements have the same remainder when divided by x
        int remainder = nums[0] % x;
        for (int num : nums) {
            if (num % x != remainder) {
                return -1;
            }
        }

        // Normalize the grid elements by their difference from the remainder
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Math.abs(nums[i] - remainder);
        }

        // Sort the normalized array
        Arrays.sort(nums);

        // Find the median element
        int median = nums[nums.length / 2];

        // Calculate the total number of operations to make all elements equal to the median
        int operations = 0;
        for (int num : nums) {
            operations += Math.abs(num - median) / x;
        }

        return operations;
    }
}
