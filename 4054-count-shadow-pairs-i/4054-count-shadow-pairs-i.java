class Solution {
    public long shadowPairs(int[] nums) {
        int n = nums.length;
        long countShadowPair = 0;
        Stack<Integer> stk = new Stack<>();
        stk.add(nums[0]);
        for(int i=1; i<=n; i++){
            if(i < n && stk.peek() <= nums[i]){
                stk.add(nums[i]);
            }
            else{
                long cnt = 1;
            
                while(stk.size()>0 && (i == n || stk.peek() > nums[i])){
                    int prevVal = stk.pop();
                    if(stk.size()>0 && prevVal != stk.peek()){
                        countShadowPair += (stk.size() * cnt);
                        cnt = 1;
                    }
                    else if(stk.size()>0 && prevVal == stk.peek()){
                        cnt++;
                    }
                }

                if(i<n) stk.add(nums[i]);
            }
        }
        return countShadowPair;
        
    }
}