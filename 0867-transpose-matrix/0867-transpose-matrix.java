class Solution {
    public int[][] transpose(int[][] matrix) {
        int [][] res = new int[matrix[0].length][matrix.length];
        // System.out.println(res[0].length+" "+res.length);
        for(int i=0; i<res.length; i++){
            for(int j=0; j<res[0].length; j++){
               
                    // int tmp = matrix[i][j];
                    // int tp = matrix
                    res[i][j] = matrix[j][i];
                    
                
            }
        }
        return res;
    }
}
// 1 2 3    1 4
// 4 5 6    2 5
//          3 6