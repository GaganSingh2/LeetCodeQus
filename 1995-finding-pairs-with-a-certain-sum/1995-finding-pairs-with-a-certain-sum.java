class FindSumPairs {
    public int[] nums1,nums2;
    private Map<Integer,Integer> map;
    public FindSumPairs(int[] nums1, int[] nums2) {
       
        this.nums1 = nums1;
        this.nums2 = nums2;
        this.map = new HashMap<>();
        for(int num:nums2){
            map.put(num,map.getOrDefault(num,0)+1);
        }
    }
    
    public void add(int index, int val) {
        int oldVal = nums2[index];
        nums2[index]+=val;
        int newVal = nums2[index];
        
        map.put(oldVal,map.get(oldVal)-1);
        
        if(map.get(oldVal)==0){
            map.remove(oldVal);
        }
        
        map.put(newVal,map.getOrDefault(newVal,0)+1);
    }
    
    public int count(int tot) {
        int count=0;
        for(int i=0;i<nums1.length;i++){
            int target = tot-nums1[i];
            count += map.getOrDefault(target,0);
        }
        return count;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */