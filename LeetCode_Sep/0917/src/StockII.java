//0918 122

public class StockII {
    public int maxProfit(int[] prices) {
        int profits = 0;
        for(int i = 0; i < prices.length - 1; i++) {
            int profit = prices[i + 1] - prices[i];
            if(profit > 0) profits += profit;
        }
        return profits;
    }

    public static void main(String[] args) {
        StockII s2 = new StockII();
        int[] arr = {7,1,5,3,4,4};
        int profit = s2.maxProfit(arr);
        System.out.println(profit);
    }
}
