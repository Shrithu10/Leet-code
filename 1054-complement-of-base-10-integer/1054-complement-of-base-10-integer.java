class Solution {
    public int bitwiseComplement(int n) {
        StringBuilder sb=new StringBuilder();
       String b=Integer.toBinaryString(n);
       for(int i=0;i<b.length();i++){
            if(b.charAt(i)=='1') sb.append(0);
            else sb.append(1);
       }
       String s=sb.toString();
       return Integer.parseInt(s,2);
    }
}