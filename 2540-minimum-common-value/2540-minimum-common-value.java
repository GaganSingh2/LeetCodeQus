class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        //1st Approach------------------------

        // Set<Integer> freq = new HashSet<>();
        // for(int i=0; i<nums1.length; i++){
        //     freq.add(nums1[i]);
        // }

        // for(int i=0; i<nums2.length; i++){
        //     if(freq.contains(nums2[i])){
        //         return nums2[i];
        //     }
        // }
        // return -1;

        //2nd Approach-----------------------------------
        int si1 = 0, si2 = 0;
        while(si1<nums1.length && si2<nums2.length){
            if(nums1[si1]==nums2[si2]){
                return nums1[si1];
            }
            else if(nums1[si1]<nums2[si2]){
                si1++;
            }
            else if(nums1[si1]>nums2[si2]){
                si2++;
            }
            else{
                si1++;
                si2++;
            }
        }
        return -1;
    }
}