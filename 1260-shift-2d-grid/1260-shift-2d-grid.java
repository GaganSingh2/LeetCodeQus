class Solution {
    private void rotate(int si, int ei, ArrayList<Integer> path){
        while(si<ei){
            int temp = path.get(si);
            path.set(si, path.get(ei));
            path.set(ei, temp);

            si++;
            ei--;
        }
    }
    private void rotateList(ArrayList<Integer> path, int k){
        k %= path.size();

        rotate(0, path.size()-1, path);
        rotate(0, k-1, path);
        rotate(k, path.size()-1, path);
    }
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {

        ArrayList<Integer> path = new ArrayList<>();
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                path.add(grid[i][j]);
            }
        }
        rotateList(path, k);
        
        List<List<Integer>> res = new ArrayList<>();
        int idx = 0;
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i=0; i<path.size(); i++){
            if(idx == grid[0].length){
                res.add(temp);
                idx = 0;
                temp = new ArrayList<>();
            }
            temp.add(path.get(i));
            idx++;
        }
        res.add(temp); //last subArray

        return res;
    }
}