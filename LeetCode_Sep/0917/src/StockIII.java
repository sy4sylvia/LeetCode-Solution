//0918 123

import java.util.ArrayList;
import java.util.Collections;

public class StockIII {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int profits = 0;



        ArrayList<Integer> multipleProfits = new ArrayList<Integer>();
        for(int i = 0; i < prices.length - 1; i++) {
            int profit = prices[i + 1] - prices[i];
            if(profit > 0) {
                profits += profit;
            }
            multipleProfits.add(profits);
        }
        Collections.sort(multipleProfits);
        Collections.reverse(multipleProfits);
        if(multipleProfits.size() >= 2) maxProfit = multipleProfits.get(0) + multipleProfits.get(1);
        else if(multipleProfits.size() == 1) maxProfit = multipleProfits.get(0);
        else maxProfit = 0;
        return maxProfit;
    }

    public static void main(String[] args) {
        StockIII s3 = new StockIII();
        int[] days = {1,2,3,4,5};
        int sum = s3.maxProfit(days);
        System.out.println(sum);
    }
}
