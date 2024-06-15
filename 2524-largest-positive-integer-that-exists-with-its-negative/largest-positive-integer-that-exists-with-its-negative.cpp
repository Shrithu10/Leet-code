class Solution {
public:
    int findMaxK(vector<int>& nums) {
        int max=-1;
        int c;
        int cnt;
        for(int i=0;i<nums.size();i++){
            
            if(nums[i]<0){
                c=-(nums[i]);
                cout<<c;cnt = count(nums.begin(), nums.end(), c);cout<<cnt<<" ";
            }
            
            
            if(c>max and cnt>=1){
                max=c;
            }
        }return max;
    }
};