class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int minPath = Integer.MAX_VALUE;
        int len = triangle.size();
        List<Integer> dp = new ArrayList<>(triangle.get(len-1));
        for (int i = len - 2; i >= 0; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                dp.set(j, triangle.get(i).get(j) + Math.min(dp.get(j), dp.get(j + 1)));
            } 
        }
        return dp.get(0);
    }
}