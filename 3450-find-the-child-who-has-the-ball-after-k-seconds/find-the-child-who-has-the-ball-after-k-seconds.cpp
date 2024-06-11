class Solution {
public:
    int numberOfChild(int n, int k) {
        int c=0;
        if(k<=n-1){
            return k;


        }
        while(k>n-1){
            k=k-(n-1);
            c=c+1;


        }
        if (c%2==0){
            
            return k;
        }
        else{
        
    return  (n-1-k);
        }

    }};