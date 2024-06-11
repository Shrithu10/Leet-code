class Solution {
public:
    string restoreString(string s, vector<int>& indices) {
        string out=s;
        for(int i=0;i<indices.size();i++){
            char m=s[i];
            cout<<m<<" ";
            int aa=indices[i];
            cout<<aa<<" ";
            out[aa]=m;
        }return out;
    }
};