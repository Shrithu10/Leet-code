class Solution {
public:
    int numberOfBeams(vector<string>& bank) {
        vector<int> v;
        for(const string& row : bank) {  
            int c = 0;
            for (char ch : row) {
                if (ch == '1') {
                    c++;
                }
            }
            if (c > 0) {
                v.push_back(c);
            }
        }

        int aa = 0;
        for (size_t i = 1; i < v.size(); i++) {  
            aa += v[i] * v[i - 1];
        }
        return aa;
    }
};
