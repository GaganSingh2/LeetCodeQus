class Solution {
    public String[] assignUmbrella(int[] rain) {
        String[] res = new String[rain.length];
        int cntAlice = 0;
        int cntBob = 0;
        for(int i=0; i<rain.length-1; i++){
            if(rain[i] == 1 && rain[i+1]==1){
                if(cntAlice>cntBob){
                    res[i] = "Bob";
                    cntBob++;
                }
                else{
                    res[i] = "Alice";
                    cntAlice++;
                }
            }
            else if(rain[i] == 1){
                res[i] = "Bob";
                cntBob++;
            }
            else{
                res[i] = "None";
            }
        }
        if(rain[rain.length-1]==1){
            res[rain.length-1] = "Bob";
        }
        else{
            res[rain.length-1] = "None";
        }
        return res;
    }
}