class Solution {
    private static boolean isPrime(int n) {
        if(n == 2) return true;
        if (n <= 1 || n%2 == 0)
            return false;
        
        for (int i = 3; i <= Math.sqrt(n); i+=2) {
            // System.out.print(i+" ");
            if (n % i == 0)
                return false;
        }
        return true;
    }
    public int[] closestPrimes(int left, int right) {
        ArrayList<Integer> list= new ArrayList<>();
        int[] result = {-1,-1};
        for (int i = left; i <= right; i++) {
            if (isPrime(i))
                list.add(i);
        }
        for(int i=0;i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
        
        if(list.size()==1 ){
            return result;
        }
        else{
            int min = Integer.MAX_VALUE;
            for(int i=0; i<list.size()-1;i++){
                if(list.get(i+1)-list.get(i)<min){
                    min = list.get(i+1)-list.get(i);
                    result[1] = list.get(i+1);
                    result[0] = list.get(i);
                }
            }
            return result;
        }
    }
}