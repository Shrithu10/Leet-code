class Solution {
public:
    vector<int> shuffle(vector<int>& nums, int n) {
        int size=nums.size();
        vector<int> a;
        int half=size/2;
        for(int i=0;i<half;i++){
            cout<<i;
            a.push_back(nums[i]);
            a.push_back(nums[i+half]);
        }return a;
    };
};