class Solution {
    public boolean isSubstringPresent(String s) {
        if(s.length()==1) return false;

        String reverse = new StringBuilder(s).reverse().toString();
        // System.out.println(newS);
        for(int i=0; i<s.length()-1; i++){
            String sub = s.substring(i,i+2);
            if(reverse.contains(sub)){
                return true;
            }
        }
        return false;
    }
}