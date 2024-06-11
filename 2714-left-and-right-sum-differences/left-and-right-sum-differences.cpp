class Solution {
public:
    vector<int> leftRightDifference(vector<int>& nums) {
        int size=nums.size();
        int sum=0;
        vector<int> left;
        vector<int> right;
        for(int i=0;i<size;i++){
            if(i>0){
            sum=sum+nums[i-1];
        }
        else{sum=0;}
        left.push_back(sum);
    }
    for(int i=size;i>0;i--){
        if(i==size){
            sum=0;
        }else{
            sum=sum+nums[i];}
        right.push_back(sum);
    }
    reverse(right.begin(), right.end());
    vector<int> out;
        for(int i=0;i<left.size();i++){
            cout<<left[i]-right[i]<<" ";
            if(left[i]-right[i]>0){
            out.push_back(left[i]-right[i]);}
            else{out.push_back(-1*(left[i]-right[i])); }
        }return out;
    }
};