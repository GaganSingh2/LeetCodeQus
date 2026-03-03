class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            freq.put(nums[i], freq.getOrDefault(nums[i], 0)+1);
        }

        PriorityQueue<Integer> minFreq = new PriorityQueue<>((a,b)->{
            int freqCompare = freq.get(a)-freq.get(b);
            if(freqCompare != 0){
                return freqCompare;
            }
            return b-a;
        });

        minFreq.addAll(freq.keySet());
        int res[] = new int[nums.length];
        int idx = 0;
        while(!minFreq.isEmpty()){
            int val = minFreq.poll();
            int len = freq.get(val);
            while(len-->0){
                res[idx++] = val;
            }
        }
        return res;
    }
}