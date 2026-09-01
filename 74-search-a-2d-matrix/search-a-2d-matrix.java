class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length;
        int col=matrix[0].length;
        int total=row*col;
        int s=0;
        int e=total-1;
        
        while(s<=e){
         int mid=(s+e)/2;
         int row1=mid/col;
         int col1=mid%col;
         if(matrix[row1][col1]==target){
            return true;
         }
         else if(target>matrix[row1][col1]){
            s=mid+1;
         }
         else{
            e=mid-1;
         }
        }
        return false;

        
    }
}