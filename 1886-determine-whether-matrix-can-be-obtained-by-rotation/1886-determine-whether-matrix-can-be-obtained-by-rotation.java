class Solution {
    public void rotate(int [][]mat){
        //transpose
        for(int i=0; i<mat.length; i++){
            for(int j=i+1; j<mat[0].length; j++){
                int tmp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = tmp;
            }
        }

        //reverse each sub-array
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat.length/2; j++){
                int tmp = mat[i][j];
                mat[i][j] = mat[i][mat.length-1-j];
                mat[i][mat.length-1-j] = tmp;
            }
        }
    }
    public boolean isEqual(int [][]mat, int [][]target){
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                if(mat[i][j] != target[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean findRotation(int[][] mat, int[][] target) {
        //there are exactly 4 possible orientations
        for(int i=0; i<4; i++){
            if(isEqual(mat,target)){
                return true;
            }
            rotate(mat);
        }
        return false;
    }
}