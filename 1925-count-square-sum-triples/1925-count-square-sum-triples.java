class Solution {
    public int countTriples(int n) {
        int cntTriple = 0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                for(int k=1; k<=n; k++){
                    int fi = i*i;
                    int sec = j*j;
                    int trd = k*k;
                    if(fi + sec == trd){
                        cntTriple++;
                    }
                }
            }
        }
        return cntTriple;
    }
}