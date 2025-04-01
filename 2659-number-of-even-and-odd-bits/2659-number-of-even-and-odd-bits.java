class Solution {
    public int[] evenOddBit(int n) {
        String b=Integer.toBinaryString(n);
        int e=0;
        int o=0;
        for(int i=0;i<b.length();i++){
            if(b.charAt(i)=='1' && (b.length() - 1 - i)%2==0) e++;
            if(b.charAt(i)=='1' && (b.length() - 1 - i)%2!=0) o++;
        }
        int[] arr=new int[2];
        arr[0]=e;
        arr[1]=o;
        return arr;
    }
}