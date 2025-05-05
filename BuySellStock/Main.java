package BuySellStock;

public class Main {
    static int profit(int[] prices){
        int maxProfit = 0;
        int minSoFar = prices[0];

        for(int i=0; i<prices.length; i++){
            minSoFar = Math.min(minSoFar, prices[i]);
            int profit = prices[i] - minSoFar;
            maxProfit = Math.max(maxProfit, profit);
        }

        return maxProfit;
    }
    public static void main(String[] args) {
        int[] prices = {7,10,1,3,6,9,2};
        // int[] prices = {7,6,4,3,1};
        System.out.println(profit(prices));
    }
}
