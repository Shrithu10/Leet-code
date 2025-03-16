class Solution {
    public boolean checkValid(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            HashSet<Integer> set=new HashSet<>();
          for(int j=0;j<matrix.length;j++){
            set.add(matrix[i][j]);
        } 
        
        if(set.size()!=matrix.length) return false; 
        }
        for(int m=0;m<matrix.length;m++){
            HashSet<Integer> s1=new HashSet<>();
          for(int n=0;n<matrix.length;n++){
            s1.add(matrix[n][m]);
        } 
        if(s1.size()!=matrix.length) return false; 
        }
        return true;
    }
}