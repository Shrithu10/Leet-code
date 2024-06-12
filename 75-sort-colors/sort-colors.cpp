class Solution {
public:
    void sortColors(vector<int>& nums) {
        vector<int>out;
        int c=0;
        set<int> s;
        for(int i:nums){
            s.insert(i);
        
        }
        for(int j:s){
            c=count(nums.begin(),nums.end(),j);
            for(int k=1;k<=c;k++){
                out.push_back(j);
            }
        }
        nums=out;
    }
};