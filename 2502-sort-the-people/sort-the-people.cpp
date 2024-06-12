class Solution {
public:
    vector<string> sortPeople(vector<string>& names, vector<int>& heights) {
        vector<int> s;
        vector<string> a;
        vector<string> out;
        s=heights;
        sort(s.begin(),s.end());
        reverse(s.begin(),s.end());
        int n = sizeof(s)/sizeof(s[0]);

        for(int i=0;i<s.size();i++){
           auto itr = find(heights.begin(), heights.end(), s[i]);
            a.push_back(names[itr - heights.begin()]);
        }return a;
    }
};