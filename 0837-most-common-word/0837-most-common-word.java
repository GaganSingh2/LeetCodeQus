class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.toLowerCase();
        String[] temp = paragraph.split("[ !?',;\\.]+");
        // for(int i=0; i<temp.length; i++){
        //     System.out.println(temp[i]);
        // }
        
        Map<String,Integer> mp = new HashMap<>();
        for(int i=0; i<temp.length; i++){
            mp.put(temp[i],mp.getOrDefault(temp[i],0)+1);
        }
        int maxCount = 0;
        String mostFrequent = "";
        for (Map.Entry<String, Integer> entry : mp.entrySet()) {
            // System.out.println(entry.getKey() + " -> " + entry.getValue());
            
            boolean isFal = false;
            for(String b: banned){
                if(b.equals(entry.getKey())){
                    isFal = true;
                    break;
                }
            }
            if(!isFal){
                if (entry.getValue() > maxCount) {
                    maxCount = entry.getValue();
                    mostFrequent = entry.getKey();
                 }
                
            }
        }
        return mostFrequent;
    }
}
