class Solution {
    public String smallestSubsequence(String s) {
        int lastIndex[] = new int[26];
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            lastIndex[ch-'a'] = i;
        }

        boolean visited[] = new boolean[26];

        Stack<Character> stk = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            //if char is already in stack so skip duplicate
            if(visited[ch-'a']){
                continue;
            }
            //otherwise, stack not empty && currentChar is smaller than topOfStackChar && topOfStackChar is occurs later so remove the top from stack
            while(!stk.isEmpty() && stk.peek()>ch && lastIndex[stk.peek()-'a']>i){
                visited[stk.pop()-'a'] = false;
            }
            stk.push(ch);
            visited[ch-'a'] = true;
        }

        StringBuilder sb = new StringBuilder("");
        for(char ch: stk){
            sb.append(ch);
        }
        return sb.toString();
    }
}