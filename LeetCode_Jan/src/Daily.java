public class Daily {
    //0118
    // 605. Can Place Flowers

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for (int i = 0; i < flowerbed.length && count < n; i++) {
            if (flowerbed[i] == 0) {
                int prev = (i == 0) ? 0 : flowerbed[i - 1];
                int next = (i == flowerbed.length - 1) ? 0 : flowerbed[i + 1];
                if (prev == 0 && next == 0) {
                    flowerbed[i] = 1; //plant here
                    count++;
                }
            }
        }
        return count == n;
    }

    public static void main(String[] args) {
        Daily d = new Daily();
        int[] flowerbed = {0, 0, 0, 0, 0};
        int n = 3;
        System.out.println(d.canPlaceFlowers(flowerbed, n));
    }
}
