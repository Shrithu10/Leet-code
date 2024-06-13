class Solution {
public:
    int alternateDigitSum(int n) {
         string s = to_string(n);
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            int a = s[i] - '0';
            if (i % 2 == 0) {
                c =c+ a;
            } else {
                c =c-a;
            }
        }
        return c;
    }
};