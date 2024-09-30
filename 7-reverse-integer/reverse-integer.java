class Solution {
 
    public int reverse(int x) {
long s=0;
        while(x!=0){
            s=(s*10)+x%10;
            x=x/10;

        }
           
    if(s>=Integer.MAX_VALUE || s<Integer.MIN_VALUE){
        return 0;
    }
    return (int)s;
    }}