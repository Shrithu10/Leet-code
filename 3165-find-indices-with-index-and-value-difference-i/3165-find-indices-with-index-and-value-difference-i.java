class Solution {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        for(int l=0;l<nums.length;l++){
            for(int r=l;r<nums.length;r++){
            if(r - l >= indexDifference && Math.abs(nums[l]-nums[r])>=valueDifference){
                return new int[]{l,r};
            }}}
        return new int[]{-1,-1};
    }
}