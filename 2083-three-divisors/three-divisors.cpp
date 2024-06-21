class Solution {
public:
    bool isThree(int n) {
        int c=0;
        for(int i=1;i<=n;i++ ){
            if(n%i==0){
                c=c+1;
            }cout<<c;
        }if(c==3){
            return true;
        }return false;
    }
};