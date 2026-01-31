class Solution {
    public int mostFrequentEven(int[] nums) {
        //Used here TreeMap for maintain the SOrting order for key(because if the occurness is same then we return smallest value and if we don't use TreeMap and big value already assign then it not changed)
        TreeMap<Integer,Integer> freq = new TreeMap<>();
        for(int i=0; i<nums.length; i++){
            if(nums[i]%2==0){
                freq.put(nums[i], freq.getOrDefault(nums[i], 0)+1);
                
            }
            
        }

        int res = -1, times = 0;
        for(Integer val: freq.keySet()){
            if(freq.get(val)>times){
                res = val;
                times = freq.get(val);
            }
        } 
        return res;
    }
}