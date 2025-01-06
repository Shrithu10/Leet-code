class Solution {
    public int pivotIndex(int[] nums) {
        int s=0;
        for(int i=0;i<nums.length;i++){
            s=s+nums[i];
           
        }
        int p=0;
        int d=0;
        for(int j=0;j<nums.length;j++){
            d=s-p-nums[j];
            if(p==d){
                return j;
            }
            p=p+nums[j];
        }
        return -1;
    }
}