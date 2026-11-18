class Solution {
    public String digitSum(String s, int k) {      
        // for(int i=0; i<s.length(); i++){
        while(true){
            if(s.length()<=k){
                return s;
            }
            StringBuilder res = new StringBuilder("");
            int cnt = 0;
            int idx = 0;
            int currSum = 0;
            while(idx<s.length()){
                currSum += s.charAt(idx) - '0';
                idx++;
                cnt++;
                if(cnt == k){
                    res.append(currSum);
                    currSum = 0;
                    cnt=0;
                }
            }
            if(cnt != 0){
                res.append(currSum);
            }
            s = res.toString();
            System.out.println(s);
        }
        // return s;
    }

}