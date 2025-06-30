class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<3){
            return false;
        }

        int si = 0;
        int ei = arr.length-1;
        while(si+1 < ei && arr[si]<arr[si+1]){
            si++;
        }
        while(ei-1 > 0 && arr[ei]<arr[ei-1]){
            ei--;
        }
        return si == ei;
    }
}