class Solution {
    public int smallestNumber(int n) {
        int binaryVal = 0, tmp = n, pow = 0, cnt = 0;
        while(tmp>0){
            int rem = tmp%2;
            binaryVal = binaryVal + (rem * (int)Math.pow(10,pow));
            cnt++;
            pow++;
            tmp /= 2;
        }
        // System.out.println(binaryVal);
        int res = (int)Math.pow(2,cnt)-1;
        tmp = res;
         binaryVal = 0;
          pow = 0;
        int cntSet = 0, cntNonSet = 0;
        while(tmp>0){
            int rem = tmp%2;
            binaryVal = binaryVal + (rem * (int)Math.pow(10,pow));
            if(rem==1){
                cntSet++;
                 pow++;
                tmp /= 2;
            }
            else{
                tmp = res-1;
                res--;
                binaryVal = 0;
                 pow = 0; cntSet = 0;
                  cntNonSet = 0;
            }
        }
        
       
        return res;
    }
}