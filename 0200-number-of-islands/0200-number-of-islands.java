class Solution {
    public int numIslands(char[][] grid) {
        int c=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    c=c+1;
                    grid[i][j]=0;
                    
                    bfs(grid,i,j);
                }
            }
        }
        return c;
    }
    static void bfs(char[][] grid,int i,int j){
        int[][] dir={{1,0},{0,1},{-1,0},{0,-1}};
        for(int[] d:dir){
            int x=i+d[0];
            int y=j+d[1];
            if(x>=0 && x<grid.length && y>=0 && y<grid[0].length && grid[x][y]=='1'){
                grid[x][y]=0;
                bfs(grid,x,y);
            }
        }
    }
}