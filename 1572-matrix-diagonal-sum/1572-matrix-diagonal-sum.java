class Solution {
    public int diagonalSum(int[][] mat) {
        int diagonalSum = 0;
        int n = mat.length; 
        int m = mat[0].length;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(i==j || (i+j == n-1)){
                    diagonalSum += mat[i][j];
                }
            }
        }

        return diagonalSum;
        
    }
}