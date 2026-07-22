class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i=0; i<strs.length; i++){
            //take one-one word at a time
            String str = strs[i];

            //convert it into character type array
            char ch[] = str.toCharArray();

            //sort the character
            Arrays.sort(ch);

            //again convert the sorted character into String
            String key = new String(ch);

            //if this new word is not present in map so create one key with this word with new empty ArrayList
            map.putIfAbsent(key, new ArrayList<>());

            //add the word with respective key
            map.get(key).add(str);
        }

        return new ArrayList<>(map.values());
    }
}