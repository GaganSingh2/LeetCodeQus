class Solution {
    public String[] createGrid(int m, int n) {
        String[] path = new String[m];
        for(int i=0; i<m; i++){
            path[i] = new String(".");
            for(int j=0; j<n-1; j++){
                if(i==m-1){
                    path[i] = path[i] + ".";
                }
                else{
                    path[i] = path[i] + "#";
                }
            }
        }
        return path;
    }
}