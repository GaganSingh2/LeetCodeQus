class Solution {
    public String simplifyPath(String path) {
        String[] str = path.split("/");
        Stack<String> stk = new Stack<>();

        for(int i=0; i<str.length; i++){
            if(str[i].equals(".") || str[i].equals("")){
                continue;
            }
            else if(str[i].equals("..")){
                if(!stk.isEmpty()){
                    stk.pop();
                }
                else{
                    continue;
                }
            }
            else{
                stk.push(str[i]);
            }
        }

        StringBuilder sb = new StringBuilder("");
        for(String str1: stk){
            sb.append("/").append(str1);
        }
        return (sb.length()>1)?sb.toString():"/";
    }
}

// 