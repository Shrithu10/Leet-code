class Solution {
public:
    vector<int> runningSum(vector<int>& nums) {
        int s =nums.size();
        vector<int> a;
        int ss=0;
        for(int i=0;i<s;i++){
            cout<<nums[i];
            cout<<"" ;
            ss=ss+nums[i];
            cout<<ss<<" ";
            a.push_back(ss);
        }return a;}
        
    };
