class Solution {
    public static int getMaximumGold(int[][] grid){
        int maxg=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                int g=trackgold(grid,i,j,0);
                maxg=Math.max(maxg,g);
            }    
        }
        return maxg;
    }
    public static int trackgold(int[][] arr ,int i,int j,int cur){
        if(i<0 || i>=arr.length || j<0 || j>=arr[0].length || arr[i][j]==0){
            return cur;
        }
        int temp=arr[i][j];
        arr[i][j]=0;
        cur=cur+temp;
        int maxg=cur;
        maxg=Math.max(maxg,trackgold(arr,i-1,j,cur));
        maxg=Math.max(maxg,trackgold(arr,i+1,j,cur));
        maxg=Math.max(maxg,trackgold(arr,i,j-1,cur));
        maxg=Math.max(maxg,trackgold(arr,i,j+1,cur));
        
        arr[i][j]=temp;
        return maxg;
    }
}