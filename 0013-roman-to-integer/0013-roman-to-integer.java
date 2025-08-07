class Solution {
    private int getValue(char ch){
        if(ch=='I') return 1;
        else if(ch=='V') return 5;
        else if(ch=='X') return 10;
        else if(ch=='L') return 50;
        else if(ch=='C') return 100;
        else if(ch=='D') return 500;
        else return 1000;
    }



    public int romanToInt(String s) {
        int intVal = 0;
        for(int i=0; i<s.length(); i++){
            int currVal = getValue(s.charAt(i));
            int nextVal = (i+1<s.length())?getValue(s.charAt(i+1)):0;
            if(currVal < nextVal){
                intVal -= currVal;
            }
            else{
                intVal += currVal;
            }
        }  
        return intVal;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
    }
}