class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int p1=0;
        int p2=1;
        while(p1<nums.length && p2<nums.length){
            if(nums[p1]%2!=0 && nums[p2]%2==0){
                int t=nums[p1];
                nums[p1]=nums[p2];
                nums[p2]=t;
                p1+=2;
                p2+=2;
            }
            else if(nums[p1]%2==0){
                p1+=2;
            }
            else if(nums[p2]%2!=0){
                p2+=2;
            }
        }
        return nums;
    }
}