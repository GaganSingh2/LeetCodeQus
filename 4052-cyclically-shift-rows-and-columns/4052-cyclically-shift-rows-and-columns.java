class Solution {
    private void rotate(int temp[], int si, int ei){
        while(si<ei){
            int curr = temp[si];
            temp[si] = temp[ei];
            temp[ei] = curr;
            si++;
            ei--;
        }
    }
    public int[][] cyclicShift(int n, int[][] grid, int[] rowShift, int[] colShift) {
        //shift each row to left
        for(int i=0; i<grid.length; i++){
            int temp[] = grid[i];
            
            int k = rowShift[i] % n;
            
            rotate(temp, 0, k-1);
            rotate(temp, k, temp.length-1);
            rotate(temp, 0, temp.length-1);
              
        }

        //shift each column to Up
        for(int j=0; j<n; j++){
            int k = colShift[j] % n;
            
            int temp[] = new int[n];
            //copy the column in temp array
            for(int p=0; p<n; p++){
                temp[p] = grid[p][j];
            }

            rotate(temp, 0, k-1);
            rotate(temp, k, temp.length-1);
            rotate(temp, 0, temp.length-1);

            //copy the temp array in original array
            for(int p=0; p<n; p++){
                grid[p][j] = temp[p];
            }    
        }

        return grid;
    }
}