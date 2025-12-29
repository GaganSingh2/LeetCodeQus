class Solution {
    public String simplifyPath(String path) {
        //1st Step
        String str[] = path.split("/");

        Stack<String> stk = new Stack<>();
        //2nd Step
        for(int i=0; i<str.length; i++){
            //if space("") and dot(.) then Ignore
            if(str[i].equals("") || str[i].equals(".")){
                continue;
            }
            // if arr[i]==".." then pop from stack
            else if(str[i].equals("..")){
                if(!stk.isEmpty()){
                    stk.pop();
                }
            }
            // Oterwise push into the stack
            else{
                stk.push(str[i]);
            }
        }
        StringBuilder sb = new StringBuilder("");
        for(String st: stk){
            sb.append("/").append(st);
        }
        return (sb.length()>1)?sb.toString(): "/";
    }
}
/*
1step:
->Split the path based on the '/'
2nd Step:
->if arr[i]==""(space) then ignore
->if arr[i]=="." then ignore
->if arr[i]==".." then pop from stack
->else push into the stack
3rd Step:
->join all the path with '/'
->start with '/'
 */