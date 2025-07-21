class Solution {
    public String makeFancyString(String s) {
        StringBuilder res = new StringBuilder("");
        int cnt = 0;
        for(int i=1; i<=s.length()-1; i++){
            char ch = s.charAt(i);
            if(s.charAt(i-1)==s.charAt(i)){
                if(cnt<3){
                    res.append(s.charAt(i-1));
                    ch = s.charAt(i-1);
                    cnt++;
                }
                
            }
            if(ch==s.charAt(i-1)){
                cnt++;
            }
            else{
                if(cnt<3){
                    res.append(s.charAt(i-1));
                }
                
                cnt = 0;
            }
            
        }
        if(cnt<3){
                res.append(s.charAt(s.length()-1));
            }
        return res.toString();
    }
}