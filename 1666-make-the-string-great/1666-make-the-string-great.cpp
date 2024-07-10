#include <iostream>
#include <stack>
#include <algorithm>

using namespace std;

class Solution {
public:
    string makeGood(string s) {
        stack<char> st;
        
        for (int i = 0; i < s.length(); ++i) {
            if (!st.empty() && (st.top() == toupper(s[i]) || st.top() == tolower(s[i])) && st.top() != s[i]) {
                st.pop();
            } else {
                st.push(s[i]);
            }
        }
        
        string ans;
        while (!st.empty()) {
            ans += st.top();
            st.pop();
        }
        
        reverse(ans.begin(), ans.end());
        return ans;
    }
};

