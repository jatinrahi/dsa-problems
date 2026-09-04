class Solution {
    public int diagonalSum(int[][] mat) {
        int row=mat.length;
        int col=mat[0].length;
        int sum=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i==j){
                sum=sum+mat[i][j];
                }
            }
        }
        for(int i=0;i<row;i++){
            for(int j=col-1;j>=0;j--){
                if(i==j){
                    continue;
                }
                if(i+j==col-1){
                sum=sum+mat[i][j];
                }
            }
        }
        return sum;
    }
}