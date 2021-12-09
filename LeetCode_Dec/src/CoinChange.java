import java.util.Arrays;
//1202
//322 Coin Change
public class CoinChange {
    public int coinChange(int[] coins, int amount) {

        if (amount == 0) return 0;
        if (coins.length == 1) {
            if (amount % coins[0] == 0) return amount / coins[0];
            else  return -1;
        }
//        Arrays.sort(coins);
        int numCoins = 0;
        int max = Integer.MAX_VALUE;
        int[] dp = new int[amount + 1]; //time complexity: O(amount / value)
        dp[0] = 0;
        for (int idx = 1; idx <= amount; idx++) dp[idx] = max;

        for (int i = 0; i < coins.length; i++) {
            //selection of coins
            for (int j = coins[i]; j <= amount; j++) {
                if (dp[j - coins[i]] != max) {
                    dp[j] = Math.min(dp[j], dp[j - coins[i]] + 1);
                } //????
            }
        }
        if (dp[amount] == max) return -1;
        else return dp[amount];
//        int index = coins.length - 1;
//        while (amount > 0 && index >= 0) {
//            numCoins += amount / coins[index];
//            amount = amount % coins[index];
//            index--;
//        }
//        return numCoins;
    }

    public static void main(String[] args) {
        CoinChange cc = new CoinChange();
        int[] coins = {2, 5};
        System.out.println(cc.coinChange(coins, 11));
    }
}
