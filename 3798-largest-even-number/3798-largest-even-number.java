class Solution {
    public String largestEven(String s) {
        if(s.charAt(s.length()-1)=='2'){
            return s;
        }
        StringBuilder sb = new StringBuilder("");
        int idx = -1;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='2'){
                idx = i;
            }
        }
        for(int i=0; i<=idx; i++){
            sb.append(s.charAt(i));
        }
        return sb.toString();
        // String lenEven = "";
        // long val = Long.parseLong(s);
        // System.out.println(val);
        // long tmp = 0,place = 1;
        // while(val>0){
        //     long digit = val % 10;
        //      tmp = tmp + digit * place;
        //     place *= 10;
        //     if(tmp % 2==0){
               
        //         lenEven = String.valueOf(tmp);
        //     }
        //     else{
        //         lenEven = "";
        //         place = 1;
        //         tmp = 0;
        //     }
        //     val /= 10;
        // }
        // while(s.)

        // return lenEven;
    }
}