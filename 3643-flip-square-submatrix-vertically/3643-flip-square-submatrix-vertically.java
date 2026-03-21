class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int sc = y, ec = y+k-1, sr = x;
        for(int i=sc; i<=ec; i++){
            for(int j=0; j<k/2; j++){
                int tmp = grid[sr+j][i];
                grid[sr+j][i] = grid[sr+k-j-1][i];
                grid[sr+k-j-1][i] = tmp;
            }
        }
        return grid;
    }
}