class Solution {
public:
    int addDigits(int num) {
        while(num>9){
        int sum = 0;
        string s = to_string(num);
        
        for (int i = 0; i < s.size(); i++) {
            int digit = s[i] - '0'; 
            sum += digit;
        }num=sum;}
        return num;
    }
};