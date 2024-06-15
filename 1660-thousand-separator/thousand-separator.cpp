class Solution {
public:
    string thousandSeparator(int n) {
        string s = to_string(n);
        int l=s.size()-3;
        if(s.size()<3){
            return s;
        }
        else{
            for(int i=l;i>0;i=i-3){
                s.insert(i,".");
            }
        }
        return s;
    }
};