class Solution {
public:
    int maxDepth(string s) {int ans=0;
        stack<char> st;
        for(char i:s){
            if(i == '('){
                st.push('(');
            }
            if(i == ')'){
                int sz=st.size();
                ans=max(ans,sz);
                st.pop();
            }
        }return ans;

    }
};