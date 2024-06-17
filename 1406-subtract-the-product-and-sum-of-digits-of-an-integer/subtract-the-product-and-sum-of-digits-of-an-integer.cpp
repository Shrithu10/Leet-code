class Solution {
public:
    int subtractProductAndSum(int n) {int sum=0;int prod=1;
        string s=to_string(n);
        for(int i=0;i<s.size();i++){
            int a = s[i] - '0';
            sum=sum+a;
            prod=prod*a;
        }
        return prod-sum;
        
    }
};