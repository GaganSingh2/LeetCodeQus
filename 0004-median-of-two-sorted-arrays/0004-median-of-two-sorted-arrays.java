class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int temp[] = new int[m+n];
        int i = 0, j = 0, idx = 0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                temp[idx] = nums1[i];
                i++;
                idx++;
            }
            else if(nums1[i]==nums2[j]){
                temp[idx] = nums1[i];
                i++;
                idx++;
                temp[idx] = nums2[j];
                j++;
                idx++;
            }
            else{
                temp[idx] = nums2[j];
                j++;
                idx++;
            }
        }
        if(i<m){
            for(int k=i; k<m; k++){
                temp[idx] = nums1[k];
                idx++;
            }
        }
        else{
            for(int l=j; l<n; l++){
                temp[idx] = nums2[l];
                idx++;
            }
        }
        double ans = 0;
        int id1 = (m+n)/2;
        if((m+n)%2==0){
            int id2 = (m+n)/2-1;
            ans = (double)(temp[id1]+temp[id2])/2;
        }
        else{
            ans = temp[id1];
        }
        return ans;
    }
}