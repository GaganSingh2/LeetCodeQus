class Solution {
    public int countSpecialIntegers(int[] nums) {
        Map<Integer, List<Integer>> freq = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int val = nums[i];
            freq.putIfAbsent(val, new ArrayList<>());
            freq.get(val).add(i);
        }

        int cnt = 0;
        for(int key: freq.keySet()){
            List<Integer> li = freq.get(key);
            int size = li.size();
            if(size != 3){
                continue;
            }
            if(li.get(2) - li.get(1) == li.get(1) - li.get(0)){
                cnt++;
            }
        }
        return cnt;
    }
}