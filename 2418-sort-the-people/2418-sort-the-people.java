class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        TreeMap<Integer,String> freq = new TreeMap<>((a,b)->b-a);
        for(int i=0; i<names.length; i++){
            freq.put(heights[i], names[i]);
        }
        String res[] = new String[names.length];
        int idx = 0;
        for(Integer val: freq.keySet()){
            // System.out.println(val+" "+freq.get(val));
            res[idx++] = freq.get(val);
        }
        return res;
    }
}