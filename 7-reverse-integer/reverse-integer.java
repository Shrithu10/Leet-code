class Solution {
    public static int rev(int x){
        long s=0;
        while(x>0){
            s=(s*10)+x%10;
            x=x/10;

        }
    if(s>=Integer.MAX_VALUE){
        return 0;
    }
    return (int)s;
    }
    public int reverse(int x) {

        if(x<0){
            return -rev(-x);
        }
        return rev(x);
        }
}