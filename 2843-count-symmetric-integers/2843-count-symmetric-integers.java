class Solution {
    public int countSymmetricIntegers(int low, int high) {
        
        int cntOfSymmetric = 0;
        for(int i=low; i<=high; i++){
            StringBuilder sb = new StringBuilder(String.valueOf(i));
            // System.out.println(sb);
            if(sb.length() % 2 != 0){
                continue;
            }
            else{
                int firHalfSum = 0, secHalfSum = 0;
                for(int j=0; j<sb.length()/2; j++){
                    firHalfSum += sb.charAt(j) - '0';
                }
                for(int j=sb.length()/2; j<sb.length(); j++){
                    secHalfSum += sb.charAt(j) - '0';
                }
                // System.out.println(firHalfSum+" "+secHalfSum);
                if(firHalfSum == secHalfSum){
                    cntOfSymmetric++;
                }
                
            }
            
        }
        return cntOfSymmetric;
    }
}