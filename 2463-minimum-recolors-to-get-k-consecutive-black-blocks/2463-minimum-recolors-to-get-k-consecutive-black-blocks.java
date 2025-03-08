class Solution {
    public int minimumRecolors(String blocks, int k) {
        int l=0;
        int r=k-1;
        int n=blocks.length();
        int min=Integer.MAX_VALUE;
        while( l<=n-k && r<n){
            min=Math.min(count(blocks,l,r),min);
            l++;
            r++;
        }
        return min;
    }
    public static int count(String arr,int l,int r){
        int c=0;
        for(int i=l;i<r+1;i++){
            if(arr.charAt(i)=='W'){
                c=c+1;
            }
        }
        return c;
    }
}