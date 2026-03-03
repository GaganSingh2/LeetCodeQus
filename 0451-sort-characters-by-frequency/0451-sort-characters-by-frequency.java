class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> freq = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            freq.put(s.charAt(i), freq.getOrDefault(s.charAt(i), 0)+1);
        }

        PriorityQueue<Character> maxFreq = new PriorityQueue<>((a,b)->freq.get(b)-freq.get(a));
        maxFreq.addAll(freq.keySet());

        StringBuilder res = new StringBuilder("");
        while(!maxFreq.isEmpty()){
            char ch = maxFreq.poll();
            int frequency = freq.get(ch);
            while(frequency-->0){
                res.append(ch);
            }
        }
        return res.toString();
    }
}