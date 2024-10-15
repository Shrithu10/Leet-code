class Solution {
    public long minimumSteps(String s) {
       long c=0;
        long c2=0;
        for(int i=s.length()-1;i>=0;i--){
            if (s.charAt(i) == '0'){
                c++;
                }
            if(s.charAt(i)=='1'){
                c2+=c;
            }
            }

        
    return c2;
    }
}