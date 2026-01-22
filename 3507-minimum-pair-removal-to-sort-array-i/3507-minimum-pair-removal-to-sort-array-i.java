class Solution {
    public int minimumPairRemoval(int[] nums) {
        ArrayList<Integer> temp = new ArrayList<>();
        for(int ele: nums){
            temp.add(ele);
        }
        int opt = 0;
        while(!isNonDec(temp)){

            int minSum = Integer.MAX_VALUE;
            int minIdx = -1;
            for(int i=0; i<temp.size()-1; i++){
                int sum = temp.get(i) + temp.get(i+1);
                if(sum<minSum){
                    minSum = sum;
                    minIdx = i;
                }
            }
            int comb = temp.get(minIdx)+temp.get(minIdx+1);
            temp.set(minIdx,comb);
            temp.remove(minIdx+1);
            opt++;
        }
        return opt;
    }

    private static boolean isNonDec(List<Integer> li){
        for(int i=1; i<li.size(); i++){
            if(li.get(i)<li.get(i-1)){
                return false;
            }
        }
        return true;
    }
}