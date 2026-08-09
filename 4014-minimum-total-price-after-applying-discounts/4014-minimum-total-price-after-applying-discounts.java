class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        double finalPrice = 0.0;
        int idx = discounts.length-1;
        for(int i=prices.length-1; i>=0; i--){
            if(idx < 0){
                finalPrice += (double)prices[i];
            }
            else{
                double price = prices[i];
                double discount = discounts[idx--];
                double currPrice = ((price * (100-discount))/100);
                // System.out.println(currPrice);
                finalPrice += currPrice;
            }
            
        }
        return finalPrice;
    }
}  
