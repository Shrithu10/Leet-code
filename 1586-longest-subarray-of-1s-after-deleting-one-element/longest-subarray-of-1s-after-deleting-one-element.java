class Solution {
    public int longestSubarray(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                max=Math.max(max,count(nums,i));
            }
        }
        if (max==Integer.MIN_VALUE) return nums.length-1;
        return max;
    }
    public static int count(int[] nums,int i){
        int r=0;
        int l=0;
        for (int j = i - 1; j >= 0 && nums[j] == 1; j--) {
            l++;
        }

        for (int j = i+ 1; j < nums.length && nums[j] == 1; j++) {
            r++;
        }
        return l+r;
    }
}