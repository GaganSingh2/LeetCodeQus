class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int minAbs = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i=1; i<=arr.length-1; i++){
            minAbs = Math.min(Math.abs(arr[i]-arr[i-1]),minAbs);
        }
        System.out.println(minAbs);
        
        List<List<Integer>> li = new ArrayList<>();
        
        for(int i=1; i<arr.length; i++){
            if(Math.abs(arr[i-1]-arr[i])==minAbs){
                List<Integer> tmp = new ArrayList<>();
                tmp.add(arr[i-1]);
                tmp.add(arr[i]);
                 li.add(tmp);
            }
        }
       
       
       return li;
    }
}