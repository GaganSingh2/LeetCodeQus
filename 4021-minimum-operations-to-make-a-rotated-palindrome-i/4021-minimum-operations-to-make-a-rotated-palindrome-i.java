class Solution {
    public int minOperations(String s) {
        int len = s.length();
        int res = Integer.MAX_VALUE;
        for(int i=0; i<len; i++){
            int operations = i;

            for(int j=0; j<len/2; j++){
                char ch1 = s.charAt((i+j)%len);

                char ch2 = s.charAt((len-1-j+i)%len);

                int diff = Math.abs(ch1-ch2);

                int cost = Math.min(diff, 26-diff);

                operations += cost;
            }
            res = Math.min(res, operations);
        }
        return res;
    }
    
}