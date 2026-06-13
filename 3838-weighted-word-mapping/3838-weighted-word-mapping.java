class Solution {
    private int sumTotal(String str, int weights[]){
        int sum = 0;
        for(int i=0; i<str.length(); i++){
            
            int idx =  str.charAt(i) - 'a';
            sum += weights[idx];
        }
        return sum;
    }
    public String mapWordWeights(String[] words, int[] weights) {
        
        int sum = 0;
        StringBuilder sb = new StringBuilder("");
        for(int i=0; i<words.length; i++){
            sum += sumTotal(words[i], weights);
            int num = sum % 26;
            sb.append((char)('z'-num));
            sum = 0;
        }
        return sb.toString();
    }
}