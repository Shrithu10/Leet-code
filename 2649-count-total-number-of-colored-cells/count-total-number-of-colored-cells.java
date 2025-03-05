class Solution {
    public long coloredCells(int n) {
        if (n==0) return 0;
        long s=1;
        for(int i=2;i<n+1;i++){
            s=s+(i-1)*4;
        }
        return s;
    }
}