class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
         int repeat = -1, missing = -1;
        int n = grid.length;
        int size = n*n;
        int[] freq = new int[size+1];
        for (int[] row : grid) {
            for (int num : row) {
                freq[num]++;
            }
        }

    
        for (int i = 1; i <= size; i++) {
            if (freq[i] == 2) {
                repeat = i;
            } else if (freq[i] == 0) {
                missing = i;
            }
        }
    
        return new int[]{repeat,missing};
    }
}