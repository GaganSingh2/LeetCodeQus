class Solution {
    public int vowelConsonantScore(String s) {
        int vowel = 0, conso = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                vowel++;
            }
            else if(ch == ' ' || (ch >= '0' && ch<='9')){
                continue;
            }
            else{
                conso++;
            }
        }
        if(conso > 0){
            return (int)Math.floor(vowel / conso);
        }
        return 0;
    }
}