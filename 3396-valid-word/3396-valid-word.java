class Solution {
    public boolean isValid(String word) {
        int cntVowel = 0, cntConsonent = 0, cntChar = 0, cntNum = 0, cntSp = 0;
        String temp = word.toLowerCase();
        
        for(int i=0; i<temp.length(); i++){
            char ch = temp.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                cntVowel++;
                cntChar++;
            }
            
            else if(ch>='0' && ch<='9'){
                cntChar++;
            }
            else if(ch=='@' || ch=='#' || ch=='$'){
               cntSp++;
            }
            else{
                if(ch!='a' || ch!='e' || ch!='i' || ch!='o' || ch!='u'){
                    cntConsonent++;
                }
                 cntChar++;
            }
                
               
            
        }
        if(cntSp>0){
            return false;
        }
        if(cntChar>=3 && cntVowel>=1 && cntConsonent>=1){
            return true;
        }
        
        return false;
    }
}