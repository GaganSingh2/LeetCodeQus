class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int nxtGreater[] = new int[nums1.length];
        for(int i=0; i<nums1.length; i++){
            for(int j=0; j<nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    int curr = nums1[i];
                    int idx = j;
                    while(idx <= nums2.length-1){
                        if(nums2[idx]>curr){
                            curr = nums2[idx];
                            break;
                        }
                        idx++;
                    }
                    if(nums1[i]<curr){
                        nxtGreater[i] = curr;
                    }
                    else{
                        nxtGreater[i] = -1;
                    }
                }
            }
        }
        return nxtGreater;
    }
}

