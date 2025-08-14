class Solution {
    public String removeKdigits(String num, int k) {
        StringBuilder res = new StringBuilder("");
        Stack<Character> track = new Stack<>();
        for(int i=0; i<num.length(); i++){
            char ch = num.charAt(i);
            while(!track.isEmpty() && track.peek()>ch && k>0){
                track.pop();
                k--;
            }
            track.push(ch);
        }
        while(k>0 && !track.isEmpty()){
            track.pop();
            k--;
        }
        
        while(!track.isEmpty()){
            res.append(track.pop());
        }

        res.reverse();
        while(res.length()>0 && res.charAt(0)=='0'){
            res.deleteCharAt(0);
        }
        return res.length()==0? "0": res.toString();
    }
}
