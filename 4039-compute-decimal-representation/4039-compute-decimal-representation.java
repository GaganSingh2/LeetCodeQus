class Solution {
    public int[] decimalRepresentation(int n) {
        ArrayList<Integer> li = new ArrayList<>();
        int base = 1;
        while(n>0){
            int rem = n % 10;
            if(rem>0){
                int digit = rem * base;
                li.add(digit);
            }
            
            base *= 10;
            n /= 10;
        }
        int res[] = new int[li.size()];
        int idx = res.length-1;
        for(int i=0; i<li.size(); i++){
            res[idx] = li.get(i);
            idx--; 
        }
        return res;
    }
}