//0929 PIMCO coding test 3
import java.util.ArrayList;
import java.util.List;

public class HighlyProfitableMonths {
    public static int countHighlyProfitableMonths(List<Integer> stockPrices, int k) {
        int result = 0;
        int left = 0, right = k - 1;
//        int initialProfit = Integer.MIN_VALUE;
        while (right < stockPrices.size()) {
            int count = 0;
            for (int i = left; i < right; i++) {
                int profit = stockPrices.get(i + 1) - stockPrices.get(i);
                if (profit > 0) {
                    count++;
                }
            }
            if (count == k - 1) result += 1;
            left++;
            right++;
        }
        return result;



//            for (int i = left; i <= right; i++) {
//                int profit = stockPrices.get(i + 1) - stockPrices.get(i);
//                if (profit > 0) count++;
//                left++;
//                right--;


//        if (count == k) result += 1;

//            else if (i == stockPrices.size() - k) {
//
//            }

//            if (i <= stockPrices.size() - k) {
//                for (int j = i; j < i + k - 1; j++) {
//                    if (initialProfit < stockPrices.get(i) ) {
//                        result += 1;
//                    }
//                }
//            }

//        int[][] profit = new int[k + 1][stockPrices.size() + 1];
//
//        for (int i = 0; i < k - 1; i++) {
//            int initialProfit = Integer.MIN_VALUE;
//            for (int j = 0; j < stockPrices.size(); j++) {
//                if (i == 0 || j == 0) profit[i][j] = 0;
//                else {
//                    initialProfit = Math.max(initialProfit, profit[i][j] - stockPrices.get(j - 1));
//                    profit[i][j] = Math.max(profit[i][j - 1], stockPrices.get(j) + initialProfit);
//                }
//            }
//        }
//        return profit[k][stockPrices.size() - 1];
    }

    public static void main(String[] args) {
        HighlyProfitableMonths hpm = new HighlyProfitableMonths();
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(3);
        l.add(4);
        l.add(5);

        int k = 3;
        System.out.println(countHighlyProfitableMonths(l, k));
    }
}
