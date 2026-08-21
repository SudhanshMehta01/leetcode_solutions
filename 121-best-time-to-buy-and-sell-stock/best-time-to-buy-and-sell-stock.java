class Solution {
    public int maxProfit(int[] arr) {
        int n = arr.length;
        int minPrice = Integer.MAX_VALUE;
        int maxProfit =0;
        for(int price : arr){
            minPrice = Math.min(price , minPrice);
            maxProfit = Math.max(maxProfit , price - minPrice);
        }
        return maxProfit;
    }
}