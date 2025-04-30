package BuySellStock;

public class Main {
    static int profit(int[] prices){

        int buyIndex = 0;
        int buyStockAmount = prices[buyIndex];
        int sellIndex = 0;
        int sellStockAmount = prices[sellIndex];

        for(int i=1; i<prices.length; i++){
            if(prices[i]<buyStockAmount){
                buyStockAmount = prices[i];
                buyIndex = i;
            }
        }

        sellIndex = buyIndex; 
        sellStockAmount = buyStockAmount;

        for(int i=buyIndex+1; i<prices.length; i++){
            if (prices[i]>sellStockAmount) {
                sellStockAmount = prices[i];
                sellIndex = i;
            }
        }

        if(sellIndex>buyIndex){
            return prices[sellIndex]-prices[buyIndex];
        }
 
        return 0;
    }
    public static void main(String[] args) {
        // int[] prices = {7,10,1,3,6,9,2};
        int[] prices = {7,6,4,3,1};
        System.out.println(profit(prices));
    }
}
