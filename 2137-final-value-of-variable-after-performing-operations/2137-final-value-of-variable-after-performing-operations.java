class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int res = 0;
        for(String ele: operations){
            if(ele.equals("++X") || ele.equals("X++")){
                res++;
            }
            else{
                res--;
            }
        }
       
        return res;
    }
}