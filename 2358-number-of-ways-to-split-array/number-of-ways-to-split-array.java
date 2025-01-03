class Solution {
    public int waysToSplitArray(int[] nums) {
        int c=0;
        long s=0;
        long ss=0;
        for(int j=0;j<nums.length;j++){
            s=s+(nums[j]);
        }
        for(int i=0;i<nums.length-1;i++){
            ss=ss+nums[i];
            if(ss>=(s-ss)){
                c++;
            }
        }
        return c;
    }
}