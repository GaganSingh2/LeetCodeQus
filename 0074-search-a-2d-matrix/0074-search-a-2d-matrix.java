class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int si = 0, ei = matrix[0].length-1;
        while(si<matrix.length && ei>=0){
            if((matrix[si][ei])==target){
                return true;
            }
            else if((matrix[si][ei])<target){
                si++;
            }
            else{
                ei--;
            }
        }

        return false;
    }
}