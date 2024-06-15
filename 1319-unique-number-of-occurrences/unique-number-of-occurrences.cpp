class Solution {
public:
bool ans=false;
    bool uniqueOccurrences(vector<int>& arr) {
        set<int>s(arr.begin(), arr.end());
        vector<int> vc(s.begin(), s.end());
        vector<int> counter;
        for(int i=0;i<vc.size();i++){
            counter.push_back(count(arr.begin(), arr.end(), vc[i]));
        }
        sort(counter.begin(),counter.end());
        for(int j=0;j<counter.size()-1;j++)
        {cout<<counter[j]<<" ";
        if(counter[j]==counter[j+1]){
            return false;
        }
         
            
         }
        
        return true;
        
        
};};