class Solution {
    public int[] frequencySort(int[] nums) {
        // //TC: O(nlogn), SC: O(n)=========================
        // HashMap<Integer,Integer> freq = new HashMap<>();
        // //Count the Frequency using HashMap
        // for(int i=0; i<nums.length; i++){
        //     freq.put(nums[i], freq.getOrDefault(nums[i], 0)+1);
        // }
        // //put Integer into PriorityQueue based on the frequency and if frequency is same then store in Decreasing order
        // PriorityQueue<Integer> minFreq = new PriorityQueue<>((a,b)->{
        //     int freqCompare = freq.get(a)-freq.get(b);
        //     if(freqCompare != 0){
        //         return freqCompare;
        //     }
        //     return b-a;
        // });

        // minFreq.addAll(freq.keySet());
        // int res[] = new int[nums.length];
        // int idx = 0;
        // while(!minFreq.isEmpty()){
        //     int val = minFreq.poll();
        //     int len = freq.get(val);
        //     while(len-->0){
        //         res[idx++] = val;
        //     }
        // }
        // return res;



        //TC: O(n), SC: O(n)-----------
       int freq[] = new int[201];
       //COunt Frequency using array
        for(int num: nums){
            freq[num+100]++;
        }
        List<Integer> bucket[] = new List[nums.length+1];
        //Numbers automatically added in descending order, No need for sorting
        for(int i=200; i>=0; i--){
            if(freq[i]>0){
                int idx = freq[i];
                if(bucket[idx] == null){
                    bucket[idx] = new ArrayList<>();
                }
                bucket[idx].add(i-100);
            }
        }

        int res[] = new int[nums.length];
        int idx = 0;
        for(int i=0; i<bucket.length; i++){
            if(bucket[i] != null){
                for(int val: bucket[i]){
                    for(int j=0; j<i; j++){
                        res[idx++] = val;
                    }
                }
            }
        }
        return res;
        // Since value range is small, I can use a frequency array and iterate in reverse order while filling buckets. 
        // This removes the need for sorting, giving pure O(n) time complexity.
    }
}