class Solution {
    public int getLeastFrequentDigit(int n) {
        Map<Integer,Integer> freq = new HashMap<>(); 
        while(n>0){
            int digit = n % 10;
            freq.put(digit,freq.getOrDefault(digit,0)+1);
            n /= 10;
        }
        int minFreq = Integer.MAX_VALUE;
        int minNum = Integer.MAX_VALUE;
        for(Map.Entry<Integer,Integer> entry: freq.entrySet()){
            if(minFreq>entry.getValue()){
                minFreq = entry.getValue();
                minNum = entry.getKey();
            }
            else if(minFreq==entry.getValue()){
                if(minNum>entry.getKey()){
                    minFreq = entry.getValue();
                    minNum = entry.getKey();
                }
            }
            // System.out.println(entry.getKey()+": "+entry.getValue());
        }
        return minNum;
    }
}