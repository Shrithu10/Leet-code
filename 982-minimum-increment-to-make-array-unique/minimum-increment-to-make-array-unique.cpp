class Solution {
public:
    int minIncrementForUnique(vector<int>& nums) {
        int c=0;
        int d=0;
        sort(nums.begin(), nums.end());
        for (int i = 1;i<nums.size(); ++i) {
            if (nums[i-1]>=nums[i]) {
                c=c+(nums[i-1]-nums[i]+1);
               nums[i] =nums[i] +(nums[i-1]-nums[i] +1);
                
            }
        }
        return c;
    }
};