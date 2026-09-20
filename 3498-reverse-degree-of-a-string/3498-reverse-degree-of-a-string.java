class Solution {
    public int reverseDegree(String s) {
        int revDegree = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            int val = 'z' - ch;
            // System.out.println('z'-s.charAt(i));
            revDegree += (i+1) * (val+1); 
        }
        
        return revDegree;
        
    }
}