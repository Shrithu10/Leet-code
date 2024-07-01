class Solution {
public:
    bool threeConsecutiveOdds(std::vector<int>& arr) {
        string s;
        for (int num : arr) {
            s += (num % 2) ? '1' : '0';
        }
        return s.find("111") != std::string::npos;
    }
};