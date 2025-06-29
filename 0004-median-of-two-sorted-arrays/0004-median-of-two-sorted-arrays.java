class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int res[] = new int[m+n];
        int i = 0,j=0,idx=0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                res[idx] = nums1[i];
                idx++;
                i++;
            }
            else if(nums1[i]==nums2[j]){
                res[idx] = nums1[i];
                idx++;
                i++;
                res[idx] = nums2[j];
                idx++;
                j++;
            }
            else{
                res[idx] = nums2[j];
                idx++;
                j++;
            }
        }
        if(i<m){
            for(int k=i; k<m; k++){
                res[idx] = nums1[k];
                idx++;
            }
        }else{
            for(int k=j; k<n; k++){
                res[idx] = nums2[k];
                idx++;
            }
        }
        double ans = 0;
        int id1 = (m+n)/2;
        if((m+n)%2==0){
            int id2 = ((m+n)/2)-1;
            
            ans = (double)(res[id1]+res[id2])/2;
        }else{
            ans = res[id1];
        }

        return ans;
    }
}