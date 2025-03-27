class Solution {
    public String reverseVowels(String s) {
         StringBuilder res= new StringBuilder("");
        char arr[] = s.toCharArray();
        int si = 0;
        int ei = arr.length-1;
        while(si<=ei){
            if(arr[si]=='a' || arr[si]=='e' || arr[si]=='i' || arr[si]=='o' || arr[si]=='u' || arr[si]=='A' || arr[si]=='E'
            || arr[si]=='I' || arr[si]=='O' || arr[si]=='U'){
                if(arr[ei]=='a' || arr[ei]=='e' || arr[ei]=='i' || arr[ei]=='o'
                || arr[ei]=='u' || arr[ei]=='A' || arr[ei]=='E' || arr[ei]=='I' || arr[ei]=='O' || arr[ei]=='U'){
                    char ch = arr[si];
                    arr[si] = arr[ei];
                    arr[ei] = ch;
                    si++;
                    ei--;
                }else{ 
                    ei--;
                }
            }
            else if(arr[si]!='a' || arr[si]!='e' || arr[si]!='i' || arr[si]!='o' || arr[si]!='u' || arr[si]!='A' || arr[si]!='E'
            || arr[si]!='I' || arr[si]!='O' || arr[si]!='U'){
                   si++;
            }
            else if(arr[ei]!='a' || arr[ei]!='e' || arr[ei]!='i' || arr[ei]!='o'|| arr[ei]!='u' || arr[ei]!='A' || arr[ei]!='E'
             || arr[ei]!='I' || arr[ei]!='O' || arr[ei]!='U'){
                     ei--;
             }
            
        }
       
        for(int i=0; i<arr.length; i++){
            res.append(arr[i]);
        }
        return res.toString();
    }
}