class Solution {
    public String largestGoodInteger(String num) {
        StringBuilder sb = new StringBuilder("");
        for(int i=0; i<num.length()-2; i++){
            char ch1 = num.charAt(i);
            char ch2 = num.charAt(i+1);
            char ch3 = num.charAt(i+2);
            if(ch1 == ch2 && ch2==ch3 && ch1==ch3){
                if(sb.length()==0){
                    sb.append(ch1);
                    sb.append(ch2);
                    sb.append(ch3);
                }else{
                    if(Integer.parseInt(sb.substring(0, 3)) < Integer.parseInt(num.substring(i, i + 3))){
                        sb.delete(0,3);
                        sb.append(ch1);
                        sb.append(ch2);
                        sb.append(ch3);
                    }
                }
            }
        }
        return sb.toString();
    }
}