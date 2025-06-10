class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int len = arr.length;
        if(arr[0]>arr[1]){
            return 0;
        }
        int si = 1, ei = len-2;
        while(si<=ei){
            int mid = si + (ei-si)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(arr[mid]<arr[mid+1]){
                si = mid+1;
            }
            else{
                ei = mid-1;
            }
        }
        return 0;
    }
}