class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] n = new int[nums.length];
        int index = 0;
    
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < pivot) {
                n[index++] = nums[i];
            }
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == pivot) {
                n[index++] = nums[i];
            }
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > pivot) {
                n[index++] = nums[i];
            }
        }
        
        return n;
    }
}
