class Solution {
    public int minimumPairRemoval(int[] nums) {
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i=0;i<nums.length; i++){
            temp.add(nums[i]);
        }
        int operation = 0;
        while(!isNonDec(temp)){
            
        
        int minsum = Integer.MAX_VALUE;
        int minIdx=-1;
        for(int i=0;i<temp.size()-1; i++){
           int sum = temp.get(i)+temp.get(i+1);
            if(sum<minsum){
                minsum = sum;
                minIdx = i;
            }
        }
        int comb = temp.get(minIdx) + temp.get(minIdx+1);
        temp.set(minIdx,comb);
        temp.remove(minIdx+1);
        operation++;
        }
        return operation;
    }
    private static boolean isNonDec(List<Integer> temp){
        for(int i=1; i<temp.size(); i++){
            if(temp.get(i)<temp.get(i-1)){
                return false;
            }
        }
        return true;
    }
}