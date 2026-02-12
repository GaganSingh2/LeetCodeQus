class Solution {
    public boolean isTrionic(int[] nums) {
        int len = nums.length;
        int i = 1;
        //Find the end point of first strictly increasing segment
        while(i<len && nums[i-1]<nums[i]){
            i++;
        }

        int p = i-1;
        //Find the end point of  strictly decreasing segment
        while(i<len && nums[i-1]>nums[i]){
            i++;
        }
        
        int q = i-1;
        //Find the end point of last strictly increasing segment
        while(i<len && nums[i-1]<nums[i]){
            i++;
        }
        int flag = i-1;
       
        return (p != 0) && (q != p) && (flag == len-1 && flag != q);
    }
}