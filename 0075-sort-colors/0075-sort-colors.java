class Solution {
    public void sortColors(int[] nums) {
        int zero=0;
        int one = 0;
        int two = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                zero++;
            }
            else if(nums[i]==1){
                one++;
            }else{
                two++;
            }
        }
        int temp = 0;
        if(temp<nums.length){
            while(zero>=1){
                nums[temp] = 0;
                temp++;
                zero--;
            }
            while(one>=1){
                nums[temp] = 1;
                temp++;
                one--;
            }
            while(two>=1){
                nums[temp] = 2;
                temp++;
                two--;
            }
        }
    }
}