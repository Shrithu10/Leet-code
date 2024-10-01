class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int s=-1;
        for(int i=0;i<matrix.length;i++){
            if (target<=matrix[i][matrix[i].length-1]){
                s=i;
                break;
            }}
        if(s!=-1){
            int low=0;
            int high=matrix[s].length-1;
            while(low<=high){
                int mid=low+(high-low)/2;
                if(matrix[s][mid]==target){
                    return true;
                }
                else if(target>matrix[s][mid]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }}
            }return false;
    }
}