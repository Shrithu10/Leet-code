class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int l=0;
        int p=1;
        int c=0;
        for(int r=0;r<nums.length;r++){
            p=p*nums[r];
            while(p>=k && l<=r){
                
                p=p/nums[l];
                l++;
            }
            c+=(r-l+1);
        }
        return c;
    }
}