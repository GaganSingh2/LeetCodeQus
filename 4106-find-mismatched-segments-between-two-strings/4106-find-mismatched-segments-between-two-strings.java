class Solution {
    public List<List<String>> findMismatchedSegments(String s1, String s2) {
        if(s1.equals(s2)){
            return new ArrayList<>();
        }
        String curr1 = "";
        String curr2 = "";

        List<List<String>> res = new ArrayList<>();
        for(int i=0; i<s1.length(); i++){
            if(s1.charAt(i) == s2.charAt(i) && i != 0 && curr1.length()>0){
                List<String> temp = new ArrayList<>();
                temp.add(curr1);
                temp.add(curr2);
                res.add(temp);
                curr1 = "";
                curr2 = "";
            }
            else if(s1.charAt(i) != s2.charAt(i)){
                curr1 += s1.charAt(i);
                curr2 += s2.charAt(i);
            }
        }
        if(curr1.length()>0){
            List<String> temp = new ArrayList<>();
                temp.add(curr1);
                temp.add(curr2);
                res.add(temp);
        }
        return res;
    }
}