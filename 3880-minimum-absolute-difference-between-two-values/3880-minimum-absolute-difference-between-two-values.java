class Solution {
    public int minAbsoluteDifference(int[] nums) {
        int minAbs = Integer.MAX_VALUE;
        int i = 0, j=1; 
        while(i<=nums.length-1 && j<=nums.length-1){
            if((nums[i]==1 && nums[j]==2) || (nums[i]==2 && nums[j]==1)){
                int currAbs = Math.abs(i-j);
                minAbs = Math.min(minAbs, currAbs);
                System.out.println(minAbs);
                i++;
            }
            else if((nums[i]==1 && nums[j]!=2) || (nums[i]==2 && nums[j]!=1)){
                j++;
            }
            else if((nums[i]!=1 && nums[j]==2) || (nums[i]!=2 && nums[j]==1)){
                i++;
            }
            else{
                j++;
                i = j;
            }
        }
        if(minAbs == 2147483647) return -1;
        return minAbs;
    }
}