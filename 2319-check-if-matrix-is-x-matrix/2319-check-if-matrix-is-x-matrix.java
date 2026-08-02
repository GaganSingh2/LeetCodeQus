class Solution {
    public boolean checkXMatrix(int[][] grid) {
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                //Diagonal Elements of The matrix are non-zero (if zero then return false)
                if(i==j || (i+j == grid.length-1)){
                    if(grid[i][j] == 0){
                        return false;
                    }
                }
                //Non-Diagonal Elements of the matrix are zero (if non-zero then return false)
                else{
                    if(grid[i][j] != 0){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}