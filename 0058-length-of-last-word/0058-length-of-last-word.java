class Solution {
    public int lengthOfLastWord(String s) {
       int end = s.length()-1;
    //    System.out.println(end); //26
       while(end>=0 && s.charAt(end)==' '){
            end--;
       }
        // System.out.println(end); //24
       int start = end;
        // System.out.println(start); //24
       while(start>=0 && s.charAt(start) != ' '){
            start--;
       }
        // System.out.println(start); //20
       return end - start;
    }
}