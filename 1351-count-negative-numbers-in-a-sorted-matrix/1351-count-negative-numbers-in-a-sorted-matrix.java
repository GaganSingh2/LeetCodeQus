class Solution {
    public int countNegatives(int[][] grid) {
        // int negativeCnt = 0;
        // for(int i=0; i<grid.length; i++){
        //     for(int j=0; j<grid[0].length; j++){
        //         if(grid[i][j]<0){
        //             negativeCnt++;
        //         }
        //     }
        // }
        // return negativeCnt;

        int negativeCnt = 0;
    
        int n = grid.length; 
        int m = grid[0].length-1;
        int row = 0, col = m;
        System.out.println(grid[row][col]);
        while(row<n && col>=0){
            if(grid[row][col]<0){
                negativeCnt += n - row;
                col--;
            }
            else{
                row++;
            }
        }
        return negativeCnt;
    }
}