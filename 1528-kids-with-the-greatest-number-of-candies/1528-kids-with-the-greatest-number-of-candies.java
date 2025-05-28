class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> res = new ArrayList<>();
        int len = candies.length;
        int maxCandi = 0;
        for(int i=0; i<len; i++){
            maxCandi = Math.max(maxCandi,candies[i]);
        }
        for(int i=0; i<len; i++){
            if((candies[i]+extraCandies)>=maxCandi){
                res.add(true);
            }
            else{
                res.add(false);
            }
        }

        return res;
    }
}