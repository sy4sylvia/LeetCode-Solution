//0918 121

public class BuySellStock {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxPrice = Integer.MIN_VALUE;
        int count1 = 0, count2 = 0;
        int profit = 0;
//

        //                if ((prices[j] - prices[i]) < 0 ) profit = 0;
//                else profit = prices[j] - prices[i];


//        if(prices[i] < minPrice) {
//            minPrice = prices[i];
//            count1++;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
                count1++;
                for (int j = i + 1; j < prices.length; j++) {
                    if (prices[i] > maxPrice) {
                        maxPrice = prices[i];
                        count2++;
                    }
                }
            }
        }
        if (count1 > count2) return 0;
        else return maxPrice - minPrice;
    }

    public static void main(String[] args) {
        BuySellStock bss = new BuySellStock();
        int[] arr = {2, 0, 2, 2, 2};
        int profit = bss.maxProfit(arr);
        System.out.println(profit);
    }
}
