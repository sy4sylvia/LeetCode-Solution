//1217
// 322. Coin Change
//top down with memoization

public class CoinChangeMemo {
    public int coinChange(int[] coins, int amount) {
        if (amount < 1) return 0;
        return coinChangeMemo(coins, amount, new int[amount]);
    }

    private int coinChangeMemo(int[] coins, int remain, int[] memo) {
        if (remain < 0) return -1;
        if (remain == 0) return 0;
        if (memo[remain - 1] != 0) return memo[remain - 1];

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < coins.length; i++) {
            int res = coinChangeMemo(coins, remain - coins[i], memo);
            if (res >= 0 && res < min) min = res + 1;
        }
        memo[remain - 1] = (min == Integer.MAX_VALUE) ? -1 : min;
        return memo[remain - 1];
    }
}
