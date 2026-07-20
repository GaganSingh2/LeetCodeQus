class Solution {
    private void rotate(int si, int ei, ArrayList<Integer> temp){
        while(si<ei){
            int val = temp.get(si);
            temp.set(si, temp.get(ei));
            temp.set(ei, val);
            si++;
            ei--;
        }
    }
    private void rotateList(ArrayList<Integer> temp, int k){
        rotate(0, temp.size()-1, temp);
        rotate(0, k-1, temp);
        rotate(k, temp.size()-1, temp);
    }
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n = grid[0].length;
        int m = grid.length;
        int total = n * m;
        k %= total;

        ArrayList<Integer> temp = new ArrayList<>();
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                temp.add(grid[i][j]);
            }
        }
        rotateList(temp, k);
        
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        int idx = 0;
        for(int i=0; i<temp.size(); i++){
            if(idx == grid[0].length){
                res.add(curr);
                curr = new ArrayList<>();
                idx = 0;
            }
            idx++;
            curr.add(temp.get(i));
        }
        res.add(curr); //last subArray
        return res;

    }
}