class Solution {
public:
    int averageValue(vector<int>& nums) {
        int s=0;
        int c=0;
        for(int i=0;i<nums.size();i++){
            if(nums[i]%2==0 and nums[i]%3==0){
                s=s+nums[i];c=c+1;
            }
        }if(c==0){return 0;}return s/c;
    }
};