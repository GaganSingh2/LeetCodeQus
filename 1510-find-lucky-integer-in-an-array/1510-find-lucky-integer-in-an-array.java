class Solution {
    public int findLucky(int[] arr) {
        Arrays.sort(arr);
        // for(int i=0; i<arr.length; i++){
        //     System.out.print(arr[i]+" ");
        // }
        int count = 1;
        int res = -1;
        for(int i=1; i<=arr.length-1; i++){
            if(arr[i]==arr[i-1]){
                count++;
            }
            else{
                if(count==arr[i-1]){
                    res = Math.max(res,arr[i-1]);
                    count = 1;
                }
                else{
                    count = 1;
                }
            }

        }
        if(count == arr[arr.length-1]){
            res = Math.max(res,arr[arr.length-1]);
        }
        return res;
    }
}