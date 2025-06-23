class Solution {
    public String[] divideString(String s, int k, char fill) {
        int len = s.length();
        int size = (int)Math.ceil((double)len/k);

        String res[] = new String[size];
        for(int i=0,j=0; i<len; i+=k, j++){
            res[j] = s.substring(i,Math.min(len,k+i));
        }

        if(res[size-1].length()==k){
            return res;
        }
        else{
            StringBuilder sb = new StringBuilder(res[size-1]);
            int si = k - res[size-1].length();
            for(int i=0; i<si; i++){
                sb.append(fill);
            }
            res[res.length-1] = sb.toString();
        }
        System.out.println(res[size-1].length());
        return res;
    }
}