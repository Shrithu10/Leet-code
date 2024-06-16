class Solution {
public:
    vector<int> applyOperations(vector<int>& nums) {
        int i=0;
       while(i<nums.size()-1){
        if(nums[i]==nums[i+1]){
            nums[i]=nums[i]*2;
            nums[i+1]=0;
        }i++;
       } int insertPos = 0;

        for (int num : nums) {
            if (num != 0) {
                nums[insertPos++] = num;
            }
        }

        while (insertPos < nums.size()) {
            nums[insertPos++] = 0;
        }return nums;
    };
};
