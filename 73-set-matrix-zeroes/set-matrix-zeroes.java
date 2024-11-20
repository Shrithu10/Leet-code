class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;

        int n=matrix[0].length;
        ArrayList<Integer> r=new ArrayList<>();
        ArrayList<Integer> c=new ArrayList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    r.add(i);
                    c.add(j);
                }
            }
        }
        for(int k:r){
            for(int i=0;i<n;i++){
            matrix[k][i]=0;
            }
        }
        for(int l:c){
            for(int i=0;i<m;i++){
            matrix[i][l]=0;
            }
        }

    }
}