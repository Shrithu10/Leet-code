class Solution {
public:
    int countSeniors(vector<string>& details) {
        int c=0;
        for(int i=0;i<details.size();i++){
            string aa=details[i];
            string s =aa.substr(11,2);
            int a=stoi(s);
            cout<<a;
            if(a>60){
                c=c+1;
            }
        }
        return c;
    }
};