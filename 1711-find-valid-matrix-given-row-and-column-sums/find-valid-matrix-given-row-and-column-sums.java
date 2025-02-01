class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int [][] grid=new int [rowSum.length][colSum.length];
        for(int i=0;i<rowSum.length;i++){
         for(int j=0;j<colSum.length;j++){
            grid[i][j]=Math.min(rowSum[i],colSum[j]);
            rowSum[i]=rowSum[i]-grid[i][j];
            colSum[j]=colSum[j]-grid[i][j];
            
        } 
        }
        return grid;  
    }
}