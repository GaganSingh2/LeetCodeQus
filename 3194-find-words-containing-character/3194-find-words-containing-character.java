class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> res = new ArrayList<>();
        // System.out.println(words[0]);
       

        for(int i=0; i<words.length; i++){
           if(words[i].indexOf(x) != -1){
            res.add(i);
           }
        }
       
        return res;
    }
}