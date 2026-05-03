class Solution {
    public boolean isEvenOrOdd(int num){
        if(num % 2 == 0){
            return true;
        }
        return false;
    }
    public int[] countOppositeParity(int[] nums) {
        int parityArr[] = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            boolean flag = isEvenOrOdd(nums[i]);
            int cnt = 0;
            for(int j=i+1; j<nums.length; j++){
                boolean tmp = isEvenOrOdd(nums[j]);
                if(flag != tmp){
                    cnt++;
                }
            }
            parityArr[i] = cnt;
        }
        parityArr[nums.length-1] = 0;
        return parityArr;
    }
}