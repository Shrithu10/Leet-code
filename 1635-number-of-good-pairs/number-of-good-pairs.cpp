class Solution {
public:
    int numIdenticalPairs(vector<int>& nums) {
        int s=nums.size();
        int c=0;
        for(int i=0;i<s;i++){
        for(int j=i+1;j<s;j++){
            cout<<nums[i]<<" "<<nums[j];
            if(nums[i]==nums[j]){
                c=c+1;
            } }}return c;
        };};