class Solution {
    public int passwordStrength(String password) {
        HashSet<Character> freq = new HashSet<>();
        for(int i=0; i<password.length(); i++){
            freq.add(password.charAt(i));
        }

        int strengthCnt = 0;
        for(Character ch: freq){
            if(ch>='a' && ch<='z'){
                strengthCnt += 1;
            }
            else if(ch>='A' && ch<='Z'){
                strengthCnt += 2;
            }
            else if(ch>='0' && ch<='9'){
                strengthCnt += 3;
            }
            else{
                strengthCnt += 5;
            }
        }
        return strengthCnt;
    }
}