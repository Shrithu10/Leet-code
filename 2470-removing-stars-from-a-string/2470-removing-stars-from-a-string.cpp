class Solution {
public:
    std::string removeStars(std::string s) {
        std::string ans;
        std::stack<char> st;
        
        for (char i : s) {
            if (i == '*') {
                if (!st.empty()) {
                    st.pop();
                }
            } else {
                st.push(i);
            }
        }
        
        while (!st.empty()) {
            ans += st.top();
            st.pop();
        }
        
        std::reverse(ans.begin(), ans.end());
        
        return ans;
    }
};