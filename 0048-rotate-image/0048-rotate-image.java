class Solution {
    public void rotate(int[][] matrix) {
        //Transpose the matrix
        for(int i=0; i<matrix[0].length; i++){
            for(int j=i; j<matrix.length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //Reverse the each array one by one
        for(int i=0; i<matrix.length; i++){
            int si = 0, ei = matrix[0].length-1;
            while(si<ei){
                int tmp = matrix[i][si];
                matrix[i][si] = matrix[i][ei];
                matrix[i][ei] = tmp;
                si++;
                ei--;
            }
        }
    }
}