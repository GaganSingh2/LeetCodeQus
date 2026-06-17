class Solution {
    public char processStr(String s, long k) {
        int n = s.length();
        long len = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '*'){
                if(len >= 1){
                   len--;
                }
            }
            else if(ch == '#'){
               len *= 2;
            }
            else if(ch == '%'){
                continue;
            }
            else{
                len++;
            }
        }
        
        if(k>=len){
            return '.';
        }
        for(long i=n-1; i>=0; i--){
            char ch = s.charAt((int)i);
            switch(ch){
                case '*':
                    len++;
                    break;
                case '#':
                    if(k>=len/2)
                        k -= len / 2; 
                    len /= 2;
                    break;
                case '%':
                    k = len - 1 - k;
                    break;
                default :
                    if(len == k+1){
                        return ch;
                    }
                    len--;
            }
        }
        return '.';
    }
}
