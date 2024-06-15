class Solution {
public:
    int repeatedNTimes(vector<int>& nums) {
        int c=0;
        int i;
        int out;
        int n=nums.size()/2;
        set<int> s(nums.begin(),nums.end());
        vector<int> v(s.begin(),s.end());
        for(int i=0;i<v.size();i++){
            c=count(nums.begin(),nums.end(),v[i]);
            cout<<c<<" ";
            cout<<v[i]<<" ";
            if(c==n){
                cout<<"n"<<c;
                out=v[i];
                
            }
        }return out;
    }
};