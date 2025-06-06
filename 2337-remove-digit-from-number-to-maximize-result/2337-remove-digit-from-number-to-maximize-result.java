class Solution {
    public String removeDigit(String number, char digit) {
        StringBuilder res = new StringBuilder("0");
        int count = 0;
        for(int i=0; i<number.length(); i++){
            char ch = number.charAt(i);
            if(digit == ch){
                StringBuilder sb = new StringBuilder(number);
                sb.deleteCharAt(i);
                if(sb.compareTo(res)>0){  //0<13235 then res = 13235.......
                    res = sb;
                }
            }
        }
        return res.toString();
    }
}
    
