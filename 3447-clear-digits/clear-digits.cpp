class Solution {
public:
    string clearDigits(string s) {
        stack<char> st;
        string ss;
        for (char i :s){
            if (isalpha(i)){
                st.push(i);
            }else{
                st.pop();
            }
        }while(!st.empty()){
            ss=ss+st.top();
            st.pop();}
    
    cout<<ss;
    
    reverse(ss.begin(),ss.end());
    return ss;}
};