class Solution {
    public void solve(char[][] board) {
        for(int i=0;i<board.length;i++){
            if(board[i][0]=='O'){
                bfs(board,i,0);
            }
            if(board[i][board[0].length-1]=='O'){
                bfs(board,i,board[0].length-1);
            }
        }
        for(int i=0;i<board[0].length;i++){
            if(board[0][i]=='O'){
                bfs(board,0,i);
            }
            if(board[board.length-1][i]=='O'){
                bfs(board,board.length-1,i);
            }
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='1'){
                    board[i][j]='O';
                }
                else board[i][j]='X';
            }
        }
    }

    static void bfs(char[][]board,int i,int j){
        board[i][j]='1';
        int[][] dir={{0,1},{1,0},{-1,0},{0,-1}};
        for(int[] d:dir){
            int x=i+d[0];
            int y=j+d[1];
            if(x>=0 && y>=0 && x<board.length && y<board[0].length && board[x][y]=='O'){
                board[x][y]='1';
                bfs(board,x,y);
            }
        }
    }
}