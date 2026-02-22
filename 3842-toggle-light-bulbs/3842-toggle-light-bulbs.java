class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int i=0; i<bulbs.size(); i++){
            freq.put(bulbs.get(i), freq.getOrDefault(bulbs.get(i), 0)+1);
        }
        List<Integer> result = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry: freq.entrySet()){
            // System.out.println(entry.getKey()+" "+entry.getValue());
            if(entry.getValue() % 2 == 1){
                result.add(entry.getKey());
            }
        }
        Collections.sort(result);
        return result;
    }
}