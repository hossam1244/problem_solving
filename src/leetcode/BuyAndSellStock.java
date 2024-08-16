
package  leetcode;
public  class BuyAndSellStock {

    public static void main(String[] args) {
        int[] prices = new int[] {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = 0;


        for (int i = 0; i < prices.length; i++) {
            if (i == 0) {
                minPrice = prices[i];
            } else {
                if (prices[i] < minPrice) {
                    minPrice = prices[i];
                } else {
                    maxProfit = Math.max(maxProfit, prices[i] - minPrice);
                }
            }
        }
        return maxProfit;
    }
}