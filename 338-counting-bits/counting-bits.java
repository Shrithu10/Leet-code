class Solution {
    public int[] countBits(int n) {
        int[] arr=new int[n+1];
        for(int i=0;i<=n;i++){
        int c=0;
        String b = Integer.toBinaryString(i);
        for(int j=0;j<b.length();j++){
            if(b.charAt(j)=='1'){
                c++;
            }
        }
        arr[i]=c;
        } 
        return arr;
    }
}