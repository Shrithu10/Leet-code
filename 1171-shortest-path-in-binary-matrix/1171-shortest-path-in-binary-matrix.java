class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        if(grid[0][0]!=0) return -1;
        return bfs(grid,0,0);
    }
    static int bfs(int[][] grid ,int i ,int j){
        Queue<int[]> q=new LinkedList<>();

        int[][] dir={{0,1},{1,0},{-1,0},{0,-1},{-1,1},{1,1},{-1,-1},{1,-1}};
        q.add(new int[]{i, j, 1});
        grid[i][j] = 1;


        while(!q.isEmpty()){
        int[] arr=q.poll();
        int x=arr[0];
        int y=arr[1];
        int steps=arr[2];
        if(x==grid.length-1 && y==grid.length-1) return steps;

        for(int[] d:dir){
            int nx=x+d[0];
            int ny=y+d[1];
            if(nx>=0 && ny>=00 && nx<grid.length && ny<grid[0].length && grid[nx][ny]==0){
                q.add(new int[]{nx, ny, steps + 1});

                grid[nx][ny]=1;

            }        
                    }}
    return -1;
    }
}