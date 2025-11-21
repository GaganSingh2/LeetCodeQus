class Solution {
    public int countOperations(int num1, int num2) {
        
        int opt = 0;
        
        int big = num1;
        int small = num2;
        while(big > 0 && small > 0){
            int tmp = big;
            big = Math.max(big,small);//2
            small = Math.min(tmp,small);//1
            big -= small;//1
            // System.out.println("Helo");
            opt++;
        }
        return opt;
    }
    

}