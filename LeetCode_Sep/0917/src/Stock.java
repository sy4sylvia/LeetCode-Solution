//0918 121 2nd attempt

public class Stock {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = Integer.MIN_VALUE;
        for(int i = 0; i < prices.length; i++) {
            if(prices[i] < minPrice) minPrice = prices[i];
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
        }
        if(maxProfit != Integer.MIN_VALUE) return maxProfit;
        else return 0;
    }

    public static void main(String[] args) {
        Stock s = new Stock();
        int[] arr = {2, 0, 2, 2, 2};
        int profit = s.maxProfit(arr);
        System.out.println(profit);
    }
}
