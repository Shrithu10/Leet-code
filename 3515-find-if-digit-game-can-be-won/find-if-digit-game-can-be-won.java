class Solution {
    public boolean canAliceWin(int[] nums) {
        int x=0;
        int y=0;
        for(int  i=0;i<nums.length;i++){
            if(nums[i]>=10){
                y=y+nums[i];
            }
            else{
                x=x+nums[i];
            }

        }
        if(x==y){
            return false;
        }return true;
    }
}