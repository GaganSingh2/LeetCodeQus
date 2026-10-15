class Solution {
    public int sumCounts(List<Integer> nums) {
        
        int sumSquare = 0;
        for(int i=0; i<nums.size(); i++){
            HashSet<Integer> freq = new HashSet<>();
            for(int j=i; j<nums.size(); j++){
                // System.out.print(nums.get(j)+" ");
                freq.add(nums.get(j));
                sumSquare += freq.size() * freq.size();
            }
            // System.out.println();
            
        }

        
        return sumSquare;
    }
}