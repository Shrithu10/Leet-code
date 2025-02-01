class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int s=nums[nums.length-1];
        for(int i=0;i<(nums.length/2);i++){
            s=Math.max(s,nums[i]+nums[nums.length-1-i]);
        }
        return s;
    }
}