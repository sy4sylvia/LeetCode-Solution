//441 Arranging Coins
//1104

// Sn = n * a1 + n * (n - 1) / 2.0
// Sn = n * (n + 1) / 2;

public class ArrangingCoins {
    public int arrangeCoins(int n) {
        return (int)(Math.sqrt((double) n * 2 + 0.25) - 0.5);
    }
}
