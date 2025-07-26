class Solution {
    public double average(int[] salary) {
        double maxSal = Integer.MIN_VALUE;
        double minSal = Integer.MAX_VALUE;
        double totalSal = 0;
        for(int i=0; i<salary.length; i++){
            if(maxSal<salary[i]){
                maxSal = salary[i];
            }
            if(minSal>salary[i]){
                minSal = salary[i];
            }
            totalSal += salary[i];
        }

        totalSal -= maxSal+minSal;
        int len = salary.length;
        len -= 2;
        return totalSal / len;
    }
}